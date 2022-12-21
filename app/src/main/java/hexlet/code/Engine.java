package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    private static String userName = "";

    public static void helloAndRules(String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
    }

    public static boolean commonLogic(String question, String correctAnswer, int gameRounds) {
        Scanner scanner = new Scanner(System.in);

        final int numberOfNeedRounds = 3;
        boolean isOver = false;
        String userAnswer;

        System.out.println(question);
        userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            isOver = true;
        }

        if (gameRounds == numberOfNeedRounds && !isOver) {
            System.out.println("Congratulations, " + userName + "!");
            isOver = true;
        }
        return isOver;
    }
}

