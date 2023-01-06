package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void calculatePrime() {

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int strings = 3;
        final int columns = 2;

        final String forAnswer = "prime";

        String[][] questionsAndAnswers = new String[strings][columns];

        Engine.setYesOrNoAnswers(questionsAndAnswers, forAnswer);
        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }
}

