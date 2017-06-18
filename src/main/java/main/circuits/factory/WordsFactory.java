package main.circuits.factory;

import main.circuits.factory.actions.AddString;
import main.circuits.factory.actions.CheckString;
import main.circuits.factory.actions.DeleteString;
import main.circuits.factory.actions.FindString;

public class WordsFactory {

    private static final String ADD_STRING = "add";

    private static final String DELETE_STRING = "del";

    private static final String FIND_STRING = "find";

    private static final String CHECK = "check";

    private final byte m;

    public WordsFactory(byte m) {
        this.m = m;
    }

    public Action getAction(final String action) {
        switch (action) {
            case ADD_STRING : return new AddString();
            case DELETE_STRING : return new DeleteString();
            case FIND_STRING : return new FindString();
            case CHECK : return new CheckString(m);
            default: return null;
        }
    }

}
