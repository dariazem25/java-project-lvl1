package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc extends Engine {

    public static void calc(String name) {
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int a = getRandom().nextInt(RANGE);
            int b = getRandom().nextInt(RANGE);
            char operator = getRandomOperator(getRandom());

            System.out.print("Question: " + a + " " + operator + " " + b + "\nYour answer: ");
            int result = calcRandomOperation(operator, a, b);
            if (getScanner().hasNextInt()) {
                int choice = getScanner().nextInt();
                processing(String.valueOf(result), String.valueOf(choice), name);
            } else {
                System.out.println("Invalid input value!");
                exit();
            }
        }
    }

    private static char getRandomOperator(Random random) {
        char randomOperator;

        switch (random.nextInt(MAX_OPERATIONS)) {
            case 0:
                randomOperator = '*';
                break;
            case 1:
                randomOperator = '+';
                break;
            case 2:
                randomOperator = '-';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + random.nextInt(MAX_OPERATIONS));
        }
        return randomOperator;
    }

    private static int calcRandomOperation(char operator, int a, int b) {
        int result;
        switch (operator) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }
}
