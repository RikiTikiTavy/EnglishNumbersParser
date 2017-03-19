import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Roman on 16.03.2017.
 */

@RunWith(Parameterized.class)
public class ParserTest {

    private String input;
    private int expectedOutput;

    Parser parser = new Parser();

  public ParserTest(String input, int expectedOutput){
       this.input = input;
       this.expectedOutput = expectedOutput;
   }

    @Parameterized.Parameters()
    public static Collection<Object[]> testConditions(){
        Object expectedOutputs[][] = {
                 {"ninety", 90}, {"one",1}, {"two", 2}, {"sixty", 60}, {"a", 1}, {"eighty", 80}, {"eleven", 11}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test()
    public void testSwitcher() throws IncorrectNumberException {
        assertEquals(expectedOutput, parser.switcher(input));
    }


    @Test(expected = IncorrectNumberException.class)
    public void testSwitcherException() throws IncorrectNumberException {
        parser.switcher("tho");
        parser.switcher("tree");
        parser.switcher("seventen");
        parser.switcher("million");
    }

    @Test()
    public void testParse() throws IncorrectNumberException {
        assertEquals(22, parser.parse("twenty-two"));
        assertEquals(9263, parser.parse("nine thousand two hundred sixty-three"));
        assertNotEquals(123, parser.parse("one thousand twenty three"));
    }

}
