package main;


import main.factory.Action;

import java.util.Map;

public class AddNumber implements Action {

    @Override
    public void doAction(final Map<String, String> listNumbers) {
        number = in.next();
        name = in.next();
        listNumbers.put(number, name);
    }

}
