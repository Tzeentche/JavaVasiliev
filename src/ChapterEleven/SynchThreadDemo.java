package ChapterEleven;

import java.util.*;

class MySynchClass {

    private int count;

    MySynchClass() {

        count = 0;
    }

    void set(int count, String name) {

        this.count = count;
        System.out.println(name + "Set the field's value " + count + ": " + new Date());
    }

    int get(String name) {

        System.out.println(name + "Field's value read's " + count + ": " + new Date());

        return count;
    }
}

class MySynchThread extends Thread {

    private boolean UpDown;
    private String name;
    private MySynchClass obj;

    public void run() {

        Random rnd = new Random();

        int number;

        for (int i = 1; i <= 3; i ++) {

            synchronized(obj) {
                try {

                    number = obj.get(name);

                    if (UpDown) number++;

                    else number--;

                    sleep(1000 + rnd.nextInt(9000));

                    obj.set(number, name);

                } catch (InterruptedException e) {

                    System.out.println(e);
                }
            }
        }
    }

    MySynchThread(boolean UpDown, MySynchClass obj) {

        this.UpDown = UpDown;

        if(UpDown) name = "Up-thread. ";

        else name = "Down-tread. ";

        this.obj = obj;

        start();
    }
}

public class SynchThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        MySynchClass obj = new MySynchClass();

        MySynchThread thA = new MySynchThread(true, obj);

        MySynchThread thB = new MySynchThread(false, obj);

        thA.join();

        thB.join();

        System.out.println("Finally: ");

        obj.get(" ");
    }
}
