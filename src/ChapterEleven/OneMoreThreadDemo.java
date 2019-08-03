package ChapterEleven;

import java.util.*;

class MyThreadTwo extends Thread {

    public void run() {

        System.out.println("Daughter's thread starts to work: " + new Date());
        Random rnd = new Random();

        for(int i = 1; i < 10; i ++) {

            try {

                sleep(1000 + rnd.nextInt(4000));
                System.out.println("Daughter's thread" + new Date());

            } catch (InterruptedException e) {

                System.out.println(e);
            }
        }

        System.out.println("Daughter's thread finished work: " + new Date());
    }

    MyThreadTwo() {

        start();
    }
}

public class OneMoreThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread start's work: " + new Date());
        Random rnd = new Random();

        new MyThreadTwo();

        for (int i = 1; i < 5; i ++) {

            Thread.sleep(5000 + rnd.nextInt(5000));
            System.out.println("Main thread: " + new Date());
        }

            System.out.println("Main thread finished work: " + new Date());
    }
}
