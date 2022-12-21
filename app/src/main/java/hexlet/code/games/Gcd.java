package hexlet.code.games;

import hexlet.code.Engine;
public class Gcd {
    public static void greatDivisor() {
        boolean isOver;

        int randomNumber1;
        int randomNumber2;

        int divisors;

        int gameRounds = 0;

        final int numberOfNeedRounds = 3;
        final int roundNumber = 100;

        String correctAnswer = "";
        String rules = "Find the greatest common divisor of given numbers.";

        Engine.helloAndRules(rules);

        while (gameRounds < numberOfNeedRounds) {
            gameRounds++;
            randomNumber1 = (int) (Math.random() * roundNumber);
            randomNumber2 = (int) (Math.random() * roundNumber);

            if (randomNumber1 > randomNumber2) {
                divisors = randomNumber2;
            } else {
                divisors = randomNumber1;
            }

            for (int i = 1; i <= divisors; i++) {
                if ((randomNumber1 % i == 0) && (randomNumber2 % i == 0)) {
                    correctAnswer = String.valueOf(i);
                }
            }

            if (randomNumber1 == 0) {
                correctAnswer = String.valueOf(randomNumber2);
            }

            if (randomNumber2 == 0) {
                correctAnswer = String.valueOf(randomNumber1);
            }

            String question = "Question: " + randomNumber1 + " " + randomNumber2;
            isOver = Engine.commonLogic(question, correctAnswer, gameRounds);
            if (isOver) {
                break;
            }
        }
    }
}
