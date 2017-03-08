import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Roman on 08.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List list = new LinkedList<Integer>();
        Parser parser = new Parser();

        String str;

        while (true) {
            try {
                str = reader.readLine();
                if(str.equals("stop")) break;
                list.add(parser.parse(str));
            } catch (IOException | IncorrectNumberException e) {
                System.err.println("Wrong number. Try to write it again");
            }
        }
        System.out.println(list);
    }
}
