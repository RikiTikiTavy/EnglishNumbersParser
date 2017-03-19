import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Roman on 19.03.2017.
 */
public class NumberDesolatorRunTest {

    Thread thread = new Thread();

    List list = new LinkedList();

    NumberDesolator desolator = new NumberDesolator(list);

    @Before
    public void listFiller() {
        list.add(15);
        list.add(156);
        list.add(123);
        list.add(8);
    }

    @Test
    public void testRun() {

        assertEquals(4, list.size());

        thread = new Thread(desolator);

        thread.start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            assertEquals(2, list.size());
        }
        assertEquals(3, list.size());

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(2, list.size());

        assertEquals(list.get(0), 156);
        assertEquals(list.get(1), 123);
    }


}
