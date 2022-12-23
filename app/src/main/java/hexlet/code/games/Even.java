package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void tryToGuessEven() {
        int randomNumber;
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int roundNumber = 1000;
        final int strings = 3;
        final int columns = 2;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber = (int) (Math.random() * roundNumber);
            String question = "Question: " + randomNumber;
            questionsAndAnswers[i][0] = question;
            if (isEven(randomNumber)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
