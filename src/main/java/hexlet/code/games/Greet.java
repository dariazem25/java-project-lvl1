package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Greet {

    private static Scanner scanner = new Scanner(System.in);

    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games! \nMay I have your name? ");
        Engine.setUser(scanner.next());
        System.out.println("Hello, " + Engine.getUser() + "!");
    }
}
