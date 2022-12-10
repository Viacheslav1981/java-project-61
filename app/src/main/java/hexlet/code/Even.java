package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void tryToGuess() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = 0;
        int countCorrectAnswers = 0;
        boolean isEven;
        String correctAnswer = "";
        String userName = Cli.meeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countCorrectAnswers < 3) {
            randomNumber = (int) (Math.random() * 1000);
            if (randomNumber % 2 == 0) {
                isEven = true;
                correctAnswer = "yes";
            } else {
                isEven = false;
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();

            if ((answer.equals("yes") && isEven) || (answer.equals("no") && !isEven)) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }

        if (countCorrectAnswers ==3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

}
