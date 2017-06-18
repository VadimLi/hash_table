package main.circuits;

import main.circuits.factory.Action;
import main.circuits.factory.WordsFactory;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static byte n;

    private static byte m;

    private static String action;

    private static String word;

    private static final Stack<String> listOfWords  = new Stack<>();

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        m = in.nextByte();

        final WordsFactory wordsFactory = new WordsFactory(m);

        n = in.nextByte();

        for (int i = 0; i < n; i++) {
            action = in.next();
            word = in.next();

            wordsFactory.getAction(action).
                         doAction(word, listOfWords);
        }

        writeNames(Action.listWords);
    }

    private static void writeNames(List<String> listOfString) {
        for (final String string : listOfString) {
            System.out.println(string);
        }
    }
}
