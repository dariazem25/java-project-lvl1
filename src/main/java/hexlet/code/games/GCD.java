package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final int MIN_VALUE = 1;

    public static void gcd() {
        String user = Engine.greeting();
        String question1 = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int a = Engine.getRandom().nextInt(Engine.RANGE - MIN_VALUE) + MIN_VALUE;
            int b = Engine.getRandom().nextInt(Engine.RANGE - MIN_VALUE) + MIN_VALUE;

            String value = a + " " + b;
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
            boolean isIncorrect = Engine.processing(question1, value, String.valueOf(result), user);
            if (isIncorrect) {
                break;
            }
        }
    }
}
