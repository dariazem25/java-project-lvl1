package hexlet.code;

import hexlet.code.games.Exit;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int CORRECT_ANSWERS = 3;
    public static final int RANGE = 100;

    private static int score = 0;
    private static String user;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static String getUser() {
        return user;
    }

    public static void setUser(String newUser) {
        Engine.user = newUser;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static Random getRandom() {
        return random;
    }

    public static void processing(String question1, String question2, String rightAnswer, boolean isString) {
        System.out.println(question1);
        System.out.print(question2);
        boolean isInteger = scanner.hasNextInt();
        String answer = scanner.next();

        if (!isInteger && !isString || (!isInteger && ((!answer.equals("yes"))
                && (!answer.equals("no")))) || (isInteger && isString)) {
            System.out.println("Invalid input value!");
            Exit.exit();
            return;
        }

        if (rightAnswer.equals(answer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("\n'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + getUser() + "!");
            Exit.exit();
        }

        if (score == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + getUser() + "!");
            Exit.exit();
        }
    }
}
