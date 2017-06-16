package main;

import java.util.*;

public class TelephoneBook {

    private final int n;

    private String action;

    private String number;

    private String name;

    private final Map<String, String> listOfNumbers;

    private final TelephoneBookFactory telephoneBookFactory;

    public TelephoneBook(final int n) {
        this.n = n;
        listOfNumbers = new HashMap<>();
        telephoneBookFactory = new TelephoneBookFactory();
    }

    public void createNumbers() {
        final Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            action = in.next();
            number = in.next();
            name = in.next();

            telephoneBookFactory.getAction(action).
                                    doAction(number, name, listOfNumbers);
        }
    }

    public void writeNumbers() {
        telephoneBookFactory.writeNumbers();
    }

}

/*

Поменять Map <name>

и структуру см. условие

 */

