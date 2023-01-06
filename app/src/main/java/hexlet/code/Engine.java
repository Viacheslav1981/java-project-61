package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void commonLogicForGames(String rules, String[][] questionsAndAnswers) {
        String userName ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        int questionNumber = 0;
        final int numberOfNeedRounds = 3;
        String userAnswer;

        while (questionNumber < numberOfNeedRounds) {
            System.out.println("Question: " + questionsAndAnswers[questionNumber][0]);
            userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            String correctAnswer = questionsAndAnswers[questionNumber][1];

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            questionNumber++;
        }

        System.out.println("Congratulations, " + userName + "!");


    }

}

