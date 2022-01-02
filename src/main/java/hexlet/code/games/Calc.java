package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    private static final int MAX_OPERATIONS = 3;

    public static void calc() {
        String question1 = "What is the result of the expression?";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int a = Engine.getRandom().nextInt(Engine.RANGE);
            int b = Engine.getRandom().nextInt(Engine.RANGE);
            char operator = getRandomOperator(Engine.getRandom());
            String question2 = "Question: " + a + " " + operator + " " + b + "\nYour answer: ";
            int result = calcRandomOperation(operator, a, b);
            Engine.processing(question1, question2, String.valueOf(result), false);
        }
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
