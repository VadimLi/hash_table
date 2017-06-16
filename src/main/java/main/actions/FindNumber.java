package main.actions;


import main.factory.Action;

import java.util.List;
import java.util.Map;

public class FindNumber implements Action {

    private static final String NOT_FOUND = "not found";

    private List<String> listNames;

    private boolean checkFind;

    public FindNumber(final List<String> listNames) {
        this.listNames = listNames;
    }

    @Override
    public void doAction(final String number,
                         final String name,
                         final Map<String, String> listNumbers) {
        checkFind = false;
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
