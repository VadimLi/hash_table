package main.circuits.factory.actions;

import main.circuits.factory.Action;

import java.util.Stack;

public class AddString implements Action {

    private static final int MAX_LENGTH = 15;

    private static final int MIN_LENGTH = 1;

    @Override
    public void doAction(final String word,
                         final Stack<String> stackWords) {
        if (word.length() <= MAX_LENGTH
                && word.length() >= MIN_LENGTH)
            stackWords.push(word);
    }

}
