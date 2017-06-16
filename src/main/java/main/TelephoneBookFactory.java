package main;

import main.factory.Action;

public class TelephoneBookFactory {

    private static final String ADD_NUMBER = "add";

    private static final String DEL_NUMBER = "del";

    private static final String FIND_NUMBER = "find";

    public Action getAction(final String action) {

        switch (action) {
            case ADD_NUMBER : return new AddNumber();
            case DEL_NUMBER : return new DeleteNumber();
            case FIND_NUMBER : return new FindNumber();
            default: throw new IllegalArgumentException("Не верная фигура. Фигура должна быть 'Rect' или 'Circle' !");
        }

    }

}
