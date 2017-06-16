package main;

import main.actions.AddNumber;
import main.actions.DeleteNumber;
import main.actions.FindNumber;
import main.factory.Action;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBookFactory {

    private static final String ADD_NUMBER = "add";

    private static final String DEL_NUMBER = "del";

    private static final String FIND_NUMBER = "find";

    private List<String> listNames;

    public TelephoneBookFactory() {
        listNames = new ArrayList<>();
    }

    public Action getAction(final String action) {
        switch (action) {
            case ADD_NUMBER : return new AddNumber();
            case DEL_NUMBER : return new DeleteNumber();
            case FIND_NUMBER : return new FindNumber(listNames);
            default: throw new IllegalArgumentException("!");
        }
    }

    public void writeNumbers() {
        for (final String name : listNames) {
            System.out.println(name);
        }
    }

}
