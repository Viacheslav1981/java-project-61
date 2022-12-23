package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case greet:
                Cli.meeting();
                break;
            case even:
                Even.tryToGuessEven();
                break;
            case calc:
                Calculator.tryToCalculateNumbers();
                break;
            case gcd:
                Gcd.tryToCalculateDivisor();
                break;
            case progression:
                Progression.tryToGuessNumberFromProgression();
                break;
            case prime:
                Prime.tryToGuessPrime();
                break;
            default:
            case 0:
                break;
        }

    }
}
