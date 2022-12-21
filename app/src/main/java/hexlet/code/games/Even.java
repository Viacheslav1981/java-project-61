package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void tryToGuessEven() {
        int randomNumber;
        boolean isOver;
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String correctAnswer;
        final int roundNumber = 1000;
        final int numberOfNeedRounds = 3;

        Engine.helloAndRules(rules);

        int gameRounds = 0;

        while (gameRounds <= numberOfNeedRounds) {
            gameRounds++;
            randomNumber = (int) (Math.random() * roundNumber);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            String question = "Question: " + randomNumber;
            isOver = Engine.commonLogic(question, correctAnswer, gameRounds);
            if (isOver) {
                break;
            }
        }
    }
}
