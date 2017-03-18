import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Roman on 18.03.2017.
 */
public class NumberReader implements Runnable {

    BufferedReader reader;
    String str;
    List list;
    Parser parser;
    Thread removeThread;

    NumberReader(Thread removeThread, List list) {
        this.removeThread = removeThread;
        this.list = list;
        reader = new BufferedReader(new InputStreamReader(System.in));
        parser = new Parser();
    }

    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    str = reader.readLine();
                    if (str.equals("stop")) {
                        removeThread.interrupt();
                        break;
                    }
                    list.add(parser.parse(str));
                } catch (IOException | IncorrectNumberException e) {
                    System.err.println("Wrong number. Try to write it again");
                }
                System.out.println(list);
            }
        }
    }

}
