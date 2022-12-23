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
        final String forAnswer = "even";

        Engine.setYesOrNoAnswers(questionsAndAnswers, forAnswer);
        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }

}
