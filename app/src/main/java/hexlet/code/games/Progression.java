package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void guessProgression() {
        boolean isOver;
        int gameRounds = 0;

        String rules = "What number is missing in the progression?";

        int startProgression = 0;
        int stepProgression = 0;
        int lengthProgression = 0;

        final int numberOfNeedRounds = 3;
        final int roundNumber1 = 10;
        final int roundNumber2 = 100;
        final int progressionRange1 = 5;
        final int progressionRange2 = 11;

        final int progressionStepRange = 20;

        String correctAnswer;

        Engine.helloAndRules(rules);

        while (gameRounds < numberOfNeedRounds) {
            gameRounds++;

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

            String question = "Question: ";
            int guessNumber = new Random().nextInt(0, progression.length);
            for (int i = 0; i < progression.length; i++) {
                if (i == guessNumber) {
                    question = question + "..";
                } else {
                    question = question + progression[i];
                }
                question = question + " ";
            }

            correctAnswer = String.valueOf(progression[guessNumber]);

            isOver = Engine.commonLogic(question, correctAnswer, gameRounds);
            if (isOver) {
                break;
            }

        }

    }

}


