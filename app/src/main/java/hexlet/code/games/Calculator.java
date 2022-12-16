package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.meeting();
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int countCorrectAnswers = 0;

        System.out.println("What is the result of the expression?");

        while (countCorrectAnswers < 3) {

            randomNumber1 = (int) (Math.random() * 10);
            randomNumber2 = (int) (Math.random() * 10);

            String[] operationsArray = new String[3];
            operationsArray[0] = "+";
            operationsArray[1] = "-";
            operationsArray[2] = "*";

            int rnd = new Random().nextInt(operationsArray.length);

            System.out.println("Question: " + randomNumber1 + " " + operationsArray[rnd] + " " + randomNumber2);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            int correctAnswer = 0;

            switch (operationsArray[rnd]) {
                case "+":
                    correctAnswer = randomNumber1 + randomNumber2;
                    break;
                case "-":
                    correctAnswer = randomNumber1 - randomNumber2;
                    break;
                case "*":
                    correctAnswer = randomNumber1 * randomNumber2;
                    break;
                default:
                case "":
                    break;

            }
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }
        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

}

