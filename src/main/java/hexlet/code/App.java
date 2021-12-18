package hexlet.code;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                Games.greeting();
            } else if (choice == 2) {
                Games.evenNumbers();
            } else if (choice == 0) {
                Games.exit();
            }
        } else {
            System.out.println("You choose incorrect value. Please try again");
            scanner.nextLine();
            menu();
        }
    }
}
