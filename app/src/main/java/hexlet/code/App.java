package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
            case 0:
                break;
        }
    }
}
