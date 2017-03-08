import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Roman on 08.03.2017.
 */
public class Main {
    BufferedReader reader;

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List list = new LinkedList<String>();

        String str;
        while(true){
            try {
               str = reader.readLine();
                list.add(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
