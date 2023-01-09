package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void calculatePrime() {

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int strings = 3;
        final int columns = 2;

        int randomNumber;
        final int roundNumber = 100;

        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber = (int) (Math.random() * roundNumber);
            String question = Integer.toString(randomNumber);
            questionsAndAnswers[i][0] = question;

            if (((isPrime(randomNumber)))) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }

        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }

    public static boolean isPrime(int randomNumber) {
        int countDivisors = 0;
        if (randomNumber == 1) {
            return false;
        }
        for (int i = 1; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                countDivisors++;
            }
        }
        return countDivisors <= 1;
    }
}

