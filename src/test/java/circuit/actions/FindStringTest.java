package circuit.actions;

import main.circuits.factory.Action;
import main.circuits.factory.actions.FindString;
import org.junit.Test;

import java.util.Stack;

import static junit.framework.Assert.assertFalse;

public class FindStringTest {

    @Test
    public void FindStringTestForDoAction() throws Exception {
        final FindString findString = new FindString();
        final Stack<String> stringStack = new Stack<>();

        final String wordYes = "yes";

        final String wordOne = "world";
        final String wordTwo = "HellO";

        stringStack.push(wordOne);
        stringStack.push(wordTwo);

        findString.doAction(wordYes, stringStack);
        assertFalse(Action.listWords.isEmpty());
    }

}
