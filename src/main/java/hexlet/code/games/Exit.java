package hexlet.code.games;

import hexlet.code.Engine;

public class Exit {

    public static void exit() {
        System.out.println("See you soon!");
        Engine.getScanner().close();
        System.exit(0);
    }
}
