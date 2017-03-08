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

       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flag = true;
                while (flag){
                    synchronized (new Main()){
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            flag = false;
                        }
                        if(list.size() != 0 ){
                            int minimum = (Integer) list.get(0);

                            for(int i = 0; i < list.size(); i++){
                                int one =  (Integer) list.get(i);
                                if(minimum > one){
                                    minimum = one;
                                }
                            }
                            System.out.println(minimum);
                            list.remove(list.indexOf(minimum));
                        }

                    }
                }

            }
        });
       t1.start();


        while (true) {
        synchronized (new Main()) {

            try {
                str = reader.readLine();
                if (str.equals("stop")) {
                    t1.interrupt(); break;
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



