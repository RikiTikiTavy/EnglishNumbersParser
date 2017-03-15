package main.java;

import java.util.List;

/**
 * Created by Roman on 08.03.2017.
 */
public class NumberReader implements Runnable{
    List list;
    boolean flag = true;

    public NumberReader(List list){
        this.list = list;
    }

    @Override
        public void run() {
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
}
