package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void chooseGame(int choice) {

        switch (choice) {
            case GREET:
                Cli.meeting();
                break;
            case EVEN:
                Even.calculateEven();
                break;
            case CALC:
                Calculator.calculateNumbers();
                break;
            case GCD:
                Gcd.calculateDivisor();
                break;
            case PROGRESSION:
                Progression.calculateNumberFromProgression();
                break;
            case PRIME:
                Prime.calculatePrime();
                break;
            default:
            case 0:
                break;
        }

    }

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

        System.out.println("Your choice: " + choice);
        chooseGame(choice);

    }

}
