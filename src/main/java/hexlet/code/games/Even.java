package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void evenNumbers() {
        String question1 = "Answer 'yes' if number even otherwise answer 'no'.";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int number = Engine.getRandom().nextInt(Engine.RANGE);
            String question2 = "Question: " + number + "\nYour answer: ";
            String rightAnswer = (number % 2) == 0 ? "yes" : "no";
            Engine.processing(question1, question2, rightAnswer, true);
        }
    }
}
