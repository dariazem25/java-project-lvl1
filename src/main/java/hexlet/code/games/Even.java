package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void play() {
        String question1 = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questions = new String[Engine.QUESTIONS];
        String[] rightAnswers = new String[Engine.QUESTIONS];

        for (int i = 0; i < questions.length; i++) {
            int number = Engine.getRandom().nextInt(Engine.RANGE);
            String rightAnswer = (number % 2) == 0 ? "yes" : "no";
            questions[i] = String.valueOf(number);
            rightAnswers[i] = rightAnswer;
        }
        Engine.run(question1, questions, rightAnswers);
    }
}
