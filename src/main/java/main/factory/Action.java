package main.factory;

import java.util.Map;

public interface Action {
    void doAction(final String number,
                  final String name,
                  final Map<String, String> listNumbers);
}
