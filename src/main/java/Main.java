import java.util.LinkedList;
import java.util.List;



public class Main {


    public static void main(String[] args) {

        List<Integer> list = new LinkedList();

        Thread removeThread = new Thread(new NumberDesolator(list));
        removeThread.start();

        Thread readThread = new Thread(new NumberReader(removeThread, list));
        readThread.start();
    }

}



