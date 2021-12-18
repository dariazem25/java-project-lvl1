package hexlet.code;

import java.util.Random;

public class Games {

    private static final int CORRECT_ANSWERS = 3;
    private static final int RANGE = 100;

    protected static String greeting() {
        System.out.print("\nWelcome to the Brain Games! \nMay I have your name? ");
        String name = App.getScanner().next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    protected static void evenNumbers() {
        String name = greeting();
        Random random = new Random();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int number = random.nextInt(RANGE);
            System.out.print("Question: " + number + "\nYour answer: ");
            String answer = App.getScanner().next();

            if ((((number % 2) == 0) && answer.equals("yes")) || (((number % 2) != 0) && answer.equals("no"))) {
                System.out.println("Correct!");
            } else if (((number % 2) == 0) && (answer.equals("no"))) {
                System.out.println("\n'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name);
                exit();
            } else if (((number % 2) != 0) && (answer.equals("yes"))) {
                System.out.println("\n'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                exit();
            } else {
                System.out.println("Invalid input value");
                exit();
            }

            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
                exit();
            }
        }
    }

    protected static void exit() {
        System.out.println("See you soon!");
        App.getScanner().close();
        System.exit(0);
    }
}
