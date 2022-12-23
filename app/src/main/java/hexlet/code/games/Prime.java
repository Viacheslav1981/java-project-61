package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static boolean isPrime(int randomNumber) {
        int countDivisors = 0;

        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                countDivisors++;
            }
        }
        return (countDivisors == 0);
    }

    public static void tryToGuessPrime() {

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int roundNumber = 100;
        final int strings = 3;
        final int columns = 2;

        int randomNumber;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber = (int) (Math.random() * roundNumber);
            String question = "Question: " + randomNumber;
            questionsAndAnswers[i][0] = question;
            if (isPrime(randomNumber)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }
}

