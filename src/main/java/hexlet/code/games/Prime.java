package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final int MIN_DIVISOR = 3;

    public static void isPrime() {
        String user = Engine.greeting();
        String question1 = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int number = Engine.getRandom().nextInt(Engine.RANGE - MIN_DIVISOR) + MIN_DIVISOR;
            String rightAnswer = "";

            if (number % 2 != 0) {
                for (int j = MIN_DIVISOR; j <= Math.ceil(Math.sqrt(number)); j++) {
                    if (number % j == 0) {
                        rightAnswer = "no";
                        break;
                    } else {
                        rightAnswer = "yes";
                    }
                }
            } else {
                rightAnswer = "no";
            }

            boolean isIncorrect = Engine.processing(question1, String.valueOf(number), rightAnswer, user);
            if (isIncorrect) {
                break;
            }
        }
    }
}
