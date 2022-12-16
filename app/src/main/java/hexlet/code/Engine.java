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

        final int greet  = 1;
        final int even = 2;
        final int calc = 3;
        final int gdc = 4;
        final int progression = 5;
        final int prime = 6;

        switch (choice) {
            case greet:
                Cli.meeting();
                break;
            case even:
                System.out.println("Your choice: " + choice);
                Even.tryToGuess();
                break;
            case calc:
                System.out.println("Your choice: " + choice);
                Calculator.calculate();
                break;
            case gdc:
                System.out.println("Your choice: " + choice);
                Gcd.greatDivisor();
                break;
            case progression:
                System.out.println("Your choice: " + choice);
                Progression.guessProgression();
                break;
            case prime:
                System.out.println("Your choice: " + choice);
                Prime.guessPrime();
                break;
            default:
            case 0:
                break;

        }
    }
}

