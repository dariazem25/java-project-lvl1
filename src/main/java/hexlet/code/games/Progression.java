package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final int BOUND = 10;
    private static int[] sequence = new int[BOUND];

    public static void progression() {
        String question1 = "What number is missing in the progression?";

        for (int i = 0; i < Engine.CORRECT_ANSWERS; i++) {
            int firstElement = Engine.getRandom().nextInt(Engine.RANGE);
            int inc = Engine.getRandom().nextInt(BOUND);
            int hiddenElement = Engine.getRandom().nextInt(BOUND);

            String progressionSequence = provideSequence(inc, firstElement, hiddenElement);
            int result = sequence[hiddenElement];
            String question2 = "Question:" + progressionSequence + "\nYour answer: ";
            Engine.processing(question1, question2, String.valueOf(result), false);
        }
    }

    private static String provideSequence(int inc, int firstElement, int hiddenElement) {
        sequence[0] = firstElement;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + inc;
        }

        for (int i = 0; i < sequence.length; i++) {
            if (i == hiddenElement) {
                result.append(" ..");
            } else {
                result.append(" ").append(sequence[i]);
            }
        }
        return result.toString();
    }
}
