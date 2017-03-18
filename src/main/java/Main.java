import java.util.LinkedList;
import java.util.List;


/**
 * Created by Roman on 08.03.2017.
 */
public class Main {


    public static void main(String[] args) {

        List list = new LinkedList<Integer>();

        Thread removeThread = new Thread(new NumberDesolator(list));
        removeThread.start();

        Thread readThread = new Thread(new NumberReader(removeThread, list));
        readThread.start();
    }

}



