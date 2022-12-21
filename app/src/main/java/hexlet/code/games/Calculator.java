package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {

    public static void calculate() {

        int randomNumber1;
        int randomNumber2;

        int gameRounds = 0;
        boolean isOver;

        final int numberOfNeedRounds = 3;
        final int roundNumber = 10;
        final int numberOfOperations = 3;

        String rules = "What is the result of the expression?";
        Engine.helloAndRules(rules);


        while (gameRounds < numberOfNeedRounds) {
            gameRounds++;

            randomNumber1 = (int) (Math.random() * roundNumber);
            randomNumber2 = (int) (Math.random() * roundNumber);

            String[] operationsArray = new String[numberOfOperations];
            operationsArray[0] = "+";
            operationsArray[1] = "-";
            operationsArray[2] = "*";

            int rnd = new Random().nextInt(operationsArray.length);

            String correctAnswer = "";

            switch (operationsArray[rnd]) {
                case "+":
                    correctAnswer = String.valueOf(randomNumber1 + randomNumber2);
                    break;
                case "-":
                    correctAnswer = String.valueOf(randomNumber1 - randomNumber2);
                    break;
                case "*":
                    correctAnswer = String.valueOf(randomNumber1 * randomNumber2);
                    break;
                default:
                case "":
                    break;
            }

            String question = "Question: " + randomNumber1 + " " + operationsArray[rnd] + " " + randomNumber2;
            isOver = Engine.commonLogic(question, correctAnswer, gameRounds);
            if (isOver) {
                break;
            }

        }

    }

}

