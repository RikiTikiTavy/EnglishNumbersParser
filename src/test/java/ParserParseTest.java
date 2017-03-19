import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Roman on 19.03.2017.
 */
public class ParserParseTest {

    Parser parser = new Parser();

    @Test()
    public void testParse() throws IncorrectNumberException {
        assertEquals(22, parser.parse("twenty-two"));
        assertEquals(9263, parser.parse("nine thousand two hundred sixty-three"));
        assertNotEquals(123, parser.parse("one thousand twenty three"));
    }
}
