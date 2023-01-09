package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {


    public static int[] getProgression(int firstElement, int stepProgression, int lengthProgression) {

        int[] progression = new int[lengthProgression];

        for (int i = 0; i < lengthProgression; i++) {
            if (i == 0) {
                progression[0] = firstElement;
            } else {
                progression[i] = progression[i - 1] + stepProgression;
            }
        }
        return progression;

    }

    public static void calculateNumberFromProgression() {

        int firstElement;
        int stepProgression;
        int lengthProgression;

        final int roundNumber = 100;
        final int progressionRange1 = 5;
        final int progressionRange2 = 11;

        final int progressionStepRange = 20;


        String rules = "What number is missing in the progression?";

        final int strings = 3;
        final int columns = 2;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            lengthProgression = new Random().nextInt(progressionRange1, progressionRange2);
            firstElement = (int) (Math.random() * roundNumber);
            stepProgression = new Random().nextInt(1, progressionStepRange);

            int[] progression = getProgression(firstElement, stepProgression, lengthProgression);

            String question = "";
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




