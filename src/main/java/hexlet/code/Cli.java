package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String meeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

}
