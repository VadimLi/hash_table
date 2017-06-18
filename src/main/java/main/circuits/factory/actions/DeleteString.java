package main.circuits.factory.actions;


import main.circuits.factory.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeleteString implements Action {

    @Override
    public void doAction(final String word,
                         final Stack<String> stackWords) {
        final List<String> copyWords = new ArrayList<>();
        copyWords.add(word);
        stackWords.removeAll(copyWords);
    }

}
