package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void guessProgression() {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.meeting();

        int startProgression = 0;
        int stepProgression = 0;
        int lengthProgression = 0;
        int countCorrectAnswers = 0;

        System.out.println("What number is missing in the progression?");

        while (countCorrectAnswers < 3) {

            lengthProgression = new Random().nextInt(5, 11);
            startProgression = (int) (Math.random() * 10);

            int[] progression = new int[lengthProgression];
            startProgression = (int) (Math.random() * 100);
            stepProgression = new Random().nextInt(1, 20);

            for (int i = 0; i < lengthProgression; i++) {
                if (i == 0) {
                    progression[0] = startProgression;
                } else {
                    progression[i] = progression[i - 1] + stepProgression;
                }
            }

            System.out.print("Question: ");
            int guessNumber = new Random().nextInt(0, progression.length);
            for (int i = 0; i < progression.length; i++) {
                if (i == guessNumber) {
                    System.out.print("..");
                } else {
                    System.out.print(progression[i]);
                }
                System.out.print(" ");
            }
            System.out.println();

            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == progression[guessNumber]) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + progression[guessNumber] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}


