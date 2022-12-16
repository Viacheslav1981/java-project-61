package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void start() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GDC");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.meeting();
                break;
            case 2:
                System.out.println("Your choice: " + choice);
                Even.tryToGuess();
                break;
            case 3:
                System.out.println("Your choice: " + choice);
                Calculator.calculate();
                break;
            case 4:
                System.out.println("Your choice: " + choice);
                Gcd.greatDivisor();
                break;
            case 5:
                System.out.println("Your choice: " + choice);
                Progression.guessProgression();
                break;
            case 6:
                System.out.println("Your choice: " + choice);
                Prime.guessPrime();
                break;
            default:
            case 0:
                break;

        }
    }
}

