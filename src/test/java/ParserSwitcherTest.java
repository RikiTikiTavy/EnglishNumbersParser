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
public class ParserSwitcherTest {

    private String input;
    private int expectedOutput;

    Parser parser = new Parser();

  public ParserSwitcherTest(String input, int expectedOutput){
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
}
