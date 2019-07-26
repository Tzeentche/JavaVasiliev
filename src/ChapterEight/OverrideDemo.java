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

        
    }
}
public class OverrideDemo {
}
