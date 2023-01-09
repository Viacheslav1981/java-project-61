package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    private static String greatDivisor(int randomNumber1, int randomNumber2) {
        String correctAnswer = "";
        int maxNumber = Math.max(randomNumber1, randomNumber2);

        if (Math.min(randomNumber1, randomNumber2) == 0) {
            return String.valueOf(maxNumber);
        }

        for (int i = 1; i < maxNumber; i++) {
            if ((randomNumber1 % i == 0) && (randomNumber2 % i == 0)) {
                correctAnswer = String.valueOf(i);
            }
        }
        return correctAnswer;
    }

    public static void calculateDivisor() {

        int randomNumber1;
        int randomNumber2;
        final int roundNumber = 100;

        final int strings = 3;
        final int columns = 2;

        String[][] questionsAndAnswers = new String[strings][columns];
        String rules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber1 = (int) (Math.random() * roundNumber);
            randomNumber2 = (int) (Math.random() * roundNumber);
            String question = randomNumber1 + " " + randomNumber2;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = greatDivisor(randomNumber1, randomNumber2);

        }
        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }
}

