package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final int MIN_DIVISOR = 3;

    public static void isPrime() {
        String question1 = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.QUESTIONS];
        String[] rightAnswers = new String[Engine.QUESTIONS];

        for (int i = 0; i < questions.length; i++) {
            int number = Engine.getRandom().nextInt(Engine.RANGE);
            String rightAnswer = "";
            boolean isEven = isEven(number);
            boolean isNegative = isNegative(number);

            if (number > 0 && number <= MIN_DIVISOR) {
                rightAnswer = "yes";
            } else if (isNegative || isEven) {
                rightAnswer = "no";
            } else {
                for (int j = MIN_DIVISOR; j <= Math.ceil(Math.sqrt(number)); j++) {
                    if (number % j == 0) {
                        rightAnswer = "no";
                        break;
                    } else {
                        rightAnswer = "yes";
                    }
                }
            }

            questions[i] = String.valueOf(number);
            rightAnswers[i] = rightAnswer;
        }
        Engine.run(question1, questions, rightAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }
}
