package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void evenNumbers() {
        String user = Engine.greeting();
        String question1 = "Answer 'yes' if number even otherwise answer 'no'.";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int number = Engine.getRandom().nextInt(Engine.RANGE);
            String rightAnswer = (number % 2) == 0 ? "yes" : "no";
            boolean isIncorrect = Engine.processing(question1, String.valueOf(number), rightAnswer, user);
            if (isIncorrect) {
                break;
            }
        }
    }
}
