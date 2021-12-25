package hexlet.code.games;

import hexlet.code.Engine;

public class Prime extends Engine {

    public static void isPrime(String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int number = getRandom().nextInt(RANGE - MIN_DIVISOR) + MIN_DIVISOR;
            System.out.print("Question: " + number + "\nYour answer: ");
            String answer = getScanner().next();
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

            if (!(answer.equals("yes")) && !(answer.equals("no"))) {
                System.out.println("Invalid input value!");
                exit();
            } else {
                processing(rightAnswer, answer, name);
            }
        }
    }
}
