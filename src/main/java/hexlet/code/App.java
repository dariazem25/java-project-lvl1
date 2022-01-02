package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.Exit;

import java.util.Scanner;

public class App {

    private static final int GREETING_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT_GAME = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            if (choice == GREETING_GAME) {
                Greet.greeting();
            } else if (choice == EVEN_GAME) {
                Greet.greeting();
                Even.evenNumbers();
            } else if (choice == CALC_GAME) {
                Greet.greeting();
                Calc.calc();
            } else if (choice == GCD_GAME) {
                Greet.greeting();
                GCD.gcd();
            } else if (choice == PROGRESSION_GAME) {
                Greet.greeting();
                Progression.progression();
            } else if (choice == PRIME_GAME) {
                Greet.greeting();
                Prime.isPrime();
            } else if (choice == EXIT_GAME) {
                Exit.exit();
            } else {
                System.out.println("A game does not exist. Please try again");
                scanner.nextLine();
                menu();
            }
        } else {
            System.out.println("Invalid input value.");
            scanner.close();
            Exit.exit();
        }
    }
}
