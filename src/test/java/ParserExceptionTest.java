import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Roman on 19.03.2017.
 */

@RunWith(Parameterized.class)
public class ParserExceptionTest {

    String input;
    Parser parser = new Parser();

    public ParserExceptionTest(String input) {
        this.input = input;
    }

    @Parameterized.Parameters()
    public static Collection<Object[]> testConditions() {
        Object expectedOutputs[][] = {
                {"ninty"}, {"aone"}, {"tho"}, {"siksty"}, {"million"}, {"seventen"}, {"eleveen"}
        };
        return Arrays.asList(expectedOutputs);
    }


    @Test(expected = IncorrectNumberException.class)
    public void testSwitcherException() throws IncorrectNumberException {
        parser.switcher(input);
    }





}
