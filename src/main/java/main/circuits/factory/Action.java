package main.circuits.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface Action {
    void doAction(final String word,
                  final Stack<String> stackWords);

    public static final List<String> listWords = new ArrayList<>();
}
