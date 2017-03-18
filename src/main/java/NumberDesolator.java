import java.util.List;

/**
 * Created by Roman on 08.03.2017.
 */
public class NumberDesolator implements Runnable {
    List list;

    public NumberDesolator(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    break;
                }
                if (list.size() != 0) {
                    int minimum = (Integer) list.get(0);

                    for (int i = 0; i < list.size(); i++) {
                        int one = (Integer) list.get(i);
                        if (minimum > one) {
                            minimum = one;
                        }
                    }
                    System.out.println(minimum);
                    list.remove(list.indexOf(minimum));
                }

            }
        }

    }
}
