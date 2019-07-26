package ChapterEight;

import javax.swing.*;

class ATwo {

    int first;

    void set() {

        first = 0;
        System.out.println("Zero value of field.");
    }

    void set(int n) {

        first = n;
        show();
    }

    void show() {

        System.out.println("Pole " + first + ".");
    }

    void showAll() {

        System.out.println("All fields - to the screen!");
        show();
    }
}

class BTwo extends ATwo {

    int second;
    void set(int n) {

        first = n;
        second = n;

        show();
    }

    void set(int m, int n) {

        second = n;

        super.set(m);
    }

    void show() {

        System.out.println("Fields " + first + " and " + second + ".");
    }
}

public class OverrideDemo {

    public static void main(String[] args) {

        ATwo objA = new ATwo();
        objA.set();
        objA.set(100);

        BTwo objB = new BTwo();

        objB.set();
        objB.second = -1;
        objB.show();
        objB.set(200);
        objB.set(1, 2);

        objA.showAll();
        objB.showAll();
    }
}
