package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void calculateEven() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int strings = 3;
        final int columns = 2;

        int randomNumber;
        final int roundNumber = 100;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber = (int) (Math.random() * roundNumber);
            String question = Integer.toString(randomNumber);
            questionsAndAnswers[i][0] = question;

            if (((isEven(randomNumber)))) {
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
