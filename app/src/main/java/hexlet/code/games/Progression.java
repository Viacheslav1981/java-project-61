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

        final int numberOfNeedAnswers = 3;
        final int roundNumber1 = 10;
        final int roundNumber2 = 100;
        final int progressionRange1 = 5;
        final int progressionRange2 = 11;

        final int progressionStepRange = 20;

        System.out.println("What number is missing in the progression?");

        while (countCorrectAnswers < numberOfNeedAnswers) {

            lengthProgression = new Random().nextInt(progressionRange1, progressionRange2);
            startProgression = (int) (Math.random() * roundNumber1);

            int[] progression = new int[lengthProgression];
            startProgression = (int) (Math.random() * roundNumber2);
            stepProgression = new Random().nextInt(1, progressionStepRange);

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
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + progression[guessNumber] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (countCorrectAnswers == numberOfNeedAnswers) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}


