package main.circuits.factory.actions;

import main.circuits.factory.Action;

import java.util.Stack;

public class FindString implements Action {

    private static final String YES = "yes";

    private static final String NO = "no";

    private boolean checkWord;

    public FindString() {
        checkWord = false;
    }

    @Override
    public void doAction(final String word,
                         final Stack<String> stackWords) {

        final Stack<String> lifoCopy = (Stack<String>) stackWords.clone();
        while (!lifoCopy.isEmpty()) {
            if (lifoCopy.pop().equals(word)) {
                checkWord = true;
                break;
            }
        }
        if (checkWord)
           listWords.add(YES);
        else listWords.add(NO);
    }

}
