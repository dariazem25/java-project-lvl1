package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    private static final int MAX_OPERATIONS = 3;

    public static void play() {
        String question = "What is the result of the expression?";
        String[] questions = new String[Engine.QUESTIONS];
        String[] rightAnswers = new String[Engine.QUESTIONS];

        for (int i = 0; i < questions.length; i++) {
            int a = Engine.getRandom().nextInt(Engine.RANGE);
            int b = Engine.getRandom().nextInt(Engine.RANGE);
            char operator = getRandomOperator(Engine.getRandom());
            String value = a + " " + operator + " " + b;
            int result = calcRandomOperation(operator, a, b);
            questions[i] = value;
            rightAnswers[i] = String.valueOf(result);
        }
        Engine.run(question, questions, rightAnswers);
    }

    private static char getRandomOperator(Random random) {
        char randomOperator = switch (random.nextInt(MAX_OPERATIONS)) {
            case 0 -> '*';
            case 1 -> '+';
            case 2 -> '-';
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(MAX_OPERATIONS));
        };

        return randomOperator;
    }

    private static int calcRandomOperation(char operator, int a, int b) {
        int result = switch (operator) {
            case '*' -> a * b;
            case '+' -> a + b;
            case '-' -> a - b;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return result;
    }
}
