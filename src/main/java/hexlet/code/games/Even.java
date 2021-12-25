package hexlet.code.games;

import hexlet.code.Engine;

public class Even extends Engine {

    public static void evenNumbers(String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int number = getRandom().nextInt(RANGE);
            System.out.print("Question: " + number + "\nYour answer: ");
            String answer = getScanner().next();
            String rightAnswer = (number % 2) == 0 ? "yes" : "no";

            if (!(answer.equals("yes")) && !(answer.equals("no"))) {
                System.out.println("Invalid input value!");
                exit();
            } else {
                processing(rightAnswer, answer, name);
            }
        }
    }
}
