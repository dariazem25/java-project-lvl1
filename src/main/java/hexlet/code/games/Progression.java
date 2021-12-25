package hexlet.code.games;

import hexlet.code.Engine;

public class Progression extends Engine {

    private static int[] sequence = new int[BOUND];

    public static void progression(String name) {
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < CORRECT_ANSWERS; i++) {
            int firstElement = getRandom().nextInt(RANGE);
            int inc = getRandom().nextInt(BOUND);
            int hiddenElement = getRandom().nextInt(BOUND);

            System.out.print("Question:");
            provideSequence(inc, firstElement, hiddenElement);
            int result = sequence[hiddenElement];
            System.out.print("\nYour answer: ");

            if (getScanner().hasNextInt()) {
                int choice = getScanner().nextInt();
                processing(String.valueOf(result), String.valueOf(choice), name);
            } else {
                System.out.println("Invalid input value!");
                exit();
            }
        }
    }

    private static void provideSequence(int inc, int firstElement, int hiddenElement) {
        sequence[0] = firstElement;

        for (int i = 1; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + inc;
        }

        for (int i = 0; i < sequence.length; i++) {
            if (i == hiddenElement) {
                System.out.print(" ..");
            } else {
                System.out.print(" " + sequence[i]);
            }
        }
    }
}
