package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

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
        if (Engine.getScanner().hasNextInt()) {
            int choice = Engine.getScanner().nextInt();

            if (choice == Engine.GREETING_GAME) {
                Engine.greeting();
            } else if (choice == Engine.EVEN_GAME) {
                Engine.greeting();
                Even.evenNumbers(Engine.getUser());
            } else if (choice == Engine.CALC_GAME) {
                Engine.greeting();
                Calc.calc(Engine.getUser());
            } else if (choice == Engine.GCD) {
                Engine.greeting();
                GCD.gcd(Engine.getUser());
            } else if (choice == Engine.PROGRESSION) {
                Engine.greeting();
                Progression.progression(Engine.getUser());
            } else if (choice == Engine.PRIME) {
                Engine.greeting();
                Prime.isPrime(Engine.getUser());
            } else if (choice == Engine.EXIT) {
                Engine.exit();
            } else {
                System.out.println("A game does not exist. Please try again");
                Engine.getScanner().nextLine();
                menu();
            }
        } else {
            System.out.println("Invalid input value.");
            Engine.exit();
        }
    }
}
