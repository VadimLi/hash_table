package main;

import java.util.*;

public class TelephoneBook {

    private static final String NOT_FOUND = "not found";

    private final int n;

    private String action;

    private String number;

    private String name;

    private Map<String, String> listNumbers;

    public TelephoneBook(final int n) {
        this.n = n;
        listNumbers = new HashMap<>();
    }

    public void createNumbers() {
        final Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            action = in.next();


            if (action.equals(ADD_NUMBER)) {

            } else if (action.equals(DEL_NUMBER)) {

            } else if (action.equals(FIND_NUMBER)) {
                number = in.next();
                for (final Map.Entry<String, String> findName : listNumbers.entrySet()) {
                    if (findName.getKey().equals(number)) {
                        listNames.add(findName.getValue());
                        checkFind = true;
                        break;
                    }
                }
                if (!checkFind)
                    listNames.add(NOT_FOUND);
            }
        }

    }

    public void writeNumbers() {
        for (final String name : listNames) {
            System.out.println(name);
        }
    }

}

/*

Поменять Map <name>

и структуру см. условие

 */

