package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final int MIN_VALUE = 1;

    public static void gcd() {
        String question1 = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.QUESTIONS];
        String[] rightAnswers = new String[Engine.QUESTIONS];

        for (int i = 0; i < questions.length; i++) {
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
            questions[i] = value;
            rightAnswers[i] = String.valueOf(result);
        }
        Engine.run(question1, questions, rightAnswers);
    }
}
