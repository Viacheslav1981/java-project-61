package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void guessPrime() {
        boolean isOver;

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String correctAnswer = "";

        final int numberOfNeedRounds = 3;
        final int roundNumber = 100;

        int gameRounds = 0;

        Engine.helloAndRules(rules);

        while (gameRounds <= numberOfNeedRounds) {
            gameRounds++;

            int guessNumber = new Random().nextInt(2, roundNumber);

            int countDivisors = 0;

            for (int i = 2; i < guessNumber; i++) {
                if (guessNumber % i == 0) {
                    countDivisors++;
                }
            }

            if (countDivisors == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            String question = "Question: " + guessNumber;
            isOver = Engine.commonLogic(question, correctAnswer, gameRounds);
            if (isOver) {
                break;
            }
        }

    }
}
