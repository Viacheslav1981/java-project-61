package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {


    public static int[] getProgression() {
        int startProgression = 0;
        int stepProgression = 0;
        int lengthProgression = 0;

        final int roundNumber1 = 10;
        final int roundNumber2 = 100;
        final int progressionRange1 = 5;
        final int progressionRange2 = 11;

        final int progressionStepRange = 20;

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
        return progression;

    }

    public static void tryToGuessNumberFromProgression() {

        String rules = "What number is missing in the progression?";

        final int strings = 3;
        final int columns = 2;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int[] progression = getProgression();

            String question = "Question: ";
            int guessNumber = new Random().nextInt(0, progression.length);
            for (int j = 0; j < progression.length; j++) {
                if (j == guessNumber) {
                    question = question + "..";
                } else {
                    question = question + progression[j];
                }
                question = question + " ";
            }
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(progression[guessNumber]);
        }

        Engine.commonLogicForGames(rules, questionsAndAnswers);

    }

}




