package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int QUESTIONS = 3;
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

    public static void run(String mainAnswer, String[] questions, String[] answers) {
        String user = greeting();
        System.out.println(mainAnswer);

        for (int i = 0; i < questions.length; i++) {
            String question1 = "Question: " + questions[i] + "\nYour answer: ";
            System.out.print(question1);
            String answer = scanner.next();

            if (answers[i].equals(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i] + "'.");
                System.out.println("Let's try again, " + user + "!");
                scanner.close();
                break;
            }
        }

        if (score == QUESTIONS) {
            System.out.println("Congratulations, " + user + "!");
            scanner.close();
        }
    }
}
