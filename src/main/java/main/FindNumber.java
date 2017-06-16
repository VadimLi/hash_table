package main;


import main.factory.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindNumber implements Action {

    private List<String> listNames;

    private boolean checkFind;

    public FindNumber() {
        listNames = new ArrayList<>();
    }

    @Override
    public void doAction(String number,
                         String name,
                         final Map<String, String> listNumbers) {
        number = in.next();
        checkFind = false;
        for (final Map.Entry<String, String> findName : listNumbers.entrySet()) {
            if (findName.getKey().equals(number)) {
                listNames.add(findName.getValue());
                checkFind = true;
                break;
            }
        }
        if (!checkFind)
            listNames.add(name);
    }

}
