package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {

    public static String calculateNumbers(int randomNumber1,
                                          int randomNumber2,
                                          char operator) {

        String correctAnswer = "";

        switch (operator) {
            case '+':
                correctAnswer = String.valueOf(randomNumber1 + randomNumber2);
                break;
            case '-':
                correctAnswer = String.valueOf(randomNumber1 - randomNumber2);
                break;
            case '*':
                correctAnswer = String.valueOf(randomNumber1 * randomNumber2);
                break;
            default:
            case ' ':
                break;
        }
        return correctAnswer;
    }

    public static void calculateNumbers() {

        int randomNumber1;
        int randomNumber2;

        final int roundNumber = 10;

        final int strings = 3;
        final int columns = 2;

        char[] operators = {'+', '-', '*'};


        String rules = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[strings][columns];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            randomNumber1 = (int) (Math.random() * roundNumber);
            randomNumber2 = (int) (Math.random() * roundNumber);

            int numberOfOperation = new Random().nextInt(operators.length);
            String question = randomNumber1 + " "
                    + operators[numberOfOperation] + " " + randomNumber2;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = calculateNumbers(randomNumber1, randomNumber2, operators[numberOfOperation]);

        }

        Engine.commonLogicForGames(rules, questionsAndAnswers);
    }

}



