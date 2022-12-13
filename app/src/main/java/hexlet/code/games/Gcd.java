package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Gcd {
    public static void greatDivisor() {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.meeting();

        int randomNumber1 = 0;
        int randomNumber2 = 0;

        int divisors = 0;
        int maxCommonDivisor = 0;

        int countCorrectAnswers = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (countCorrectAnswers < 3) {
            randomNumber1 = (int) (Math.random() * 100);
            randomNumber2 = (int) (Math.random() * 100);

            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

            if (randomNumber1 > randomNumber2) {
                divisors = randomNumber2;
            } else {
                divisors = randomNumber1;
            }

            for (int i = 1; i <= divisors; i++) {
                if ((randomNumber1 % i == 0) && (randomNumber2 % i == 0)) {
                    maxCommonDivisor = i;
                }
            }

            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == maxCommonDivisor) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + maxCommonDivisor + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
