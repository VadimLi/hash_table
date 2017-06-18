package circuit.actions;

import main.circuits.factory.Action;
import main.circuits.factory.actions.CheckString;
import org.junit.Test;

import java.util.Stack;

import static junit.framework.Assert.assertFalse;

public class CheckStringTest {

    @Test
    public void CheckTestStringForDoAction() throws Exception {
        final int m = 5;

        final CheckString checkString = new CheckString(m);
        final Stack<String> stringStack = new Stack<>();

        final String wordOne = "world";
        final String wordTwo = "HellO";

        final int actualResult = 3;

        stringStack.push(wordOne);
        stringStack.push(wordTwo);

        checkString.doAction(String.valueOf(actualResult), stringStack);
        assertFalse(Action.listWords.isEmpty());
        System.out.println(Action.listWords);
    }

//    @Test
//    public void CheckingTestStringForFunctionH() throws Exception {
//        final int m = 3;
//        final CheckString checkString = new CheckString(m);
//
//        final int actualResult = 2;
//        final String word = "help";
//        assertEquals(checkString.functionH(word), actualResult);
//    }

}
