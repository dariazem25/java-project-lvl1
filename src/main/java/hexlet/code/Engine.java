package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int CORRECT_ANSWERS = 3;
    public static final int RANGE = 100;

    private static int score = 0;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static Random getRandom() {
        return random;
    }

    public static String greeting() {
        System.out.print("\nWelcome to the Brain Games! \nMay I have your name? ");
        String user = scanner.next();
        System.out.println("Hello, " + user + "!");
        return user;
    }

    public static void exit() {
        System.out.println("See you soon!");
        scanner.close();
    }

    public static boolean processing(String question1, String value, String rightAnswer, String user) {
        System.out.println(question1);
        String question2 = "Question: " + value + "\nYour answer: ";
        System.out.print(question2);
        String answer = scanner.next();
        boolean isIncorrect = false;

        if (rightAnswer.equals(answer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + user + "!");
            scanner.close();
            isIncorrect = true;
        }

        if (score == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + user + "!");
            scanner.close();
        }

        return isIncorrect;
    }
}
