import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Roman on 20.03.2017.
 */
public class NumberDesolatorInterruptionTest {


    Thread thread = new Thread();

    List list = new LinkedList();

    NumberDesolator desolator = new NumberDesolator(list);


    @Test(timeout = 2500)
    public void testInterruption() {
        thread = new Thread(desolator);
        thread.start();

        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
