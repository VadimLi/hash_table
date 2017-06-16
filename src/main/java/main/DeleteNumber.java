package main;


import main.factory.Action;

import java.util.Map;

public class DeleteNumber implements Action {

    @Override
    public void doAction(final Map<String, String> listNumbers) {
        number = in.next();
        listNumbers.remove(number);
    }

}
