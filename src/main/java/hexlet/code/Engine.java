package hexlet.code;

import java.util.Scanner;

public class Engine {

    protected static final int CORRECT_ANSWERS = 3;
    protected static final int RANGE = 100;
    protected static final int MIN_VALUE = 1;
    protected static final int MAX_OPERATIONS = 3;
    protected static final int GREETING_GAME = 1;
    protected static final int EVEN_GAME = 2;
    protected static final int CALC_GAME = 3;
    protected static final int GCD = 4;
    protected static final int EXIT = 0;


    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;
    private static String user;

    public static String getUser() {
        return user;
    }

    public static void setUser(String newUser) {
        Engine.user = newUser;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    protected static void greeting() {
        System.out.print("\nWelcome to the Brain Games! \nMay I have your name? ");
        setUser(getScanner().next());
        System.out.println("Hello, " + getUser() + "!");
    }

    protected static void exit() {
        System.out.println("See you soon!");
        getScanner().close();
        System.exit(0);
    }

    protected static void processing(String rightAnswer, String answer, String name) {
        if (rightAnswer.equals(answer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("\n'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            exit();
        }

        if (score == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + name + "!");
            exit();
        }
    }
}
