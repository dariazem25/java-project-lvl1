package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final int BOUND = 10;
    private static int[] sequence = new int[BOUND];

    public static void progression() {
        String question1 = "What number is missing in the progression?";
        String[] questions = new String[Engine.QUESTIONS];
        String[] rightAnswers = new String[Engine.QUESTIONS];

        for (int i = 0; i < questions.length; i++) {
            int firstElement = Engine.getRandom().nextInt(Engine.RANGE);
            int inc = Engine.getRandom().nextInt(BOUND);
            int hiddenElement = Engine.getRandom().nextInt(BOUND);

            provideSequence(inc, firstElement);
            int result = sequence[hiddenElement];
            questions[i] = hideElement(hiddenElement);
            rightAnswers[i] = String.valueOf(result);
        }
        Engine.run(question1, questions, rightAnswers);
    }

    private static void provideSequence(int inc, int firstElement) {
        sequence[0] = firstElement;

        for (int i = 1; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + inc;
        }
    }

    private static String hideElement(int hiddenElement) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sequence.length; i++) {
            if (i == hiddenElement) {
                result.append(".. ");
            } else {
                result.append(sequence[i]).append(" ");
            }
        }
        return result.toString();
    }
}
