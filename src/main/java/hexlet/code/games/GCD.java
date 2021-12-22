package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD extends Engine {

    public static void gcd(String name) {
        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int a = random.nextInt(RANGE - MIN_VALUE) + MIN_VALUE;
            int b = random.nextInt(RANGE - MIN_VALUE) + MIN_VALUE;

            System.out.print("Question: " + a + " " + b + "\nYour answer: ");
            if (getScanner().hasNextInt()) {
                int choice = getScanner().nextInt();
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                int result;

                if (max % min != 0) {
                    while ((max % min) != 0) {
                        int reminder = max % min;
                        max = min;
                        min = reminder;
                    }
                }
                result = min;
                processing(String.valueOf(result), String.valueOf(choice), name);
            } else {
                System.out.println("Invalid input value!");
                exit();
            }
        }
    }
}
