package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String userName = "";

    public static void commonLogicForGames(String rules, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        helloAndRules(rules);

        int questionNumber = 0;
        final int numberOfNeedRounds = 3;
        String userAnswer;

        while (questionNumber < numberOfNeedRounds) {
            System.out.println(questionsAndAnswers[questionNumber][0]);
            userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            String correctAnswer = questionsAndAnswers[questionNumber][1];

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            questionNumber++;
        }

        if (questionNumber == numberOfNeedRounds) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

    public static void helloAndRules(String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int randomNumber) {
        int countDivisors = 0;

        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                countDivisors++;
            }
        }
        return (countDivisors == 0);
    }

    public static void setYesOrNoAnswers(String[][] questionsAndAnswers, String primeOrEven) {
        int randomNumber;
        final int roundNumber = 100;

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber = (int) (Math.random() * roundNumber);
            String question = "Question: " + randomNumber;
            questionsAndAnswers[i][0] = question;

            if ((primeOrEven.equals("even") && (Engine.isEven(randomNumber)))
                    || (primeOrEven.equals("prime") && (Engine.isPrime(randomNumber)))) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
    }

}

