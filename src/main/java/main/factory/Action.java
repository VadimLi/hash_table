package main.factory;

import java.util.Map;
import java.util.Scanner;

public interface Action {
    void doAction(final Map<String, String> listNumbers);

    static String number = null;
    static String name = null;

    static final Scanner in = new Scanner(System.in);
}
