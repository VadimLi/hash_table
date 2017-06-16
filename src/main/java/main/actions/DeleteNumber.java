package main.actions;


import main.factory.Action;

import java.util.Map;

public class DeleteNumber implements Action {

    @Override
    public void doAction(final String number,
                         final String name,
                         final Map<String, String> listNumbers) {
        listNumbers.remove(number);
    }

}
