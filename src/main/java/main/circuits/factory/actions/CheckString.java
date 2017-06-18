package main.circuits.factory.actions;

import main.circuits.factory.Action;

import java.util.Stack;

public class CheckString implements Action {

    private static final long P = 1_000_000_007;

    private static final int X = 263;

    private final int m;

    public CheckString(final int m) {
        this.m = m;
    }

    private long functionH(final String word) {
        long result = 0;
        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) word.charAt(i);
            result += (ascii * Math.pow(X, i));
        }
        return result % P % m;
    }

    @Override
    public void doAction(final String word,
                         final Stack<String> stackWords) {
        String resultString = "";
        String result;
        final Stack<String> lifoCopy = (Stack<String>) stackWords.clone();
        while (!lifoCopy.isEmpty()) {
            result = lifoCopy.pop();
            if (Integer.parseInt(word) == functionH(result)) {
                resultString += result + " ";
            }
        }
        listWords.add(resultString);
    }

}
