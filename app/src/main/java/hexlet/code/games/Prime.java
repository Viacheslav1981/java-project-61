package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void guessPrime() {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.meeting();
        int countCorrectAnswers = 0;
        String correctAnswer = "";


        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean isPrime = false;

        while (countCorrectAnswers < 3) {
            int guessNumber = new Random().nextInt(2, 100);

            System.out.println("Question: " + guessNumber);
            String answer = scanner.next();
            int countDivisors = 0;

            for (int i = 2; i < guessNumber; i++) {
                if (guessNumber % i == 0) {
                    countDivisors++;
                }
            }

            if (countDivisors == 0) {
                isPrime = true;
                correctAnswer = "yes";
            } else {
                isPrime = false;
                correctAnswer = "no";
            }

            if ((answer.equals("yes") && isPrime) || (answer.equals("no") && !isPrime)) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }

        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
