package ChapterEight;

import javax.swing.*;

interface BaseThird {

    void show();
}

class AThird implements BaseThird {

    public void show() {

        System.out.println("It is method of A-class!");
    }
}

class BThird implements BaseThird {

    public void show() {

        System.out.println("It is method of B-class!");
    }
}

public class InterfaceRefDemo {

    public static void main(String[] args) {

        BaseThird ref;

        ref = new AThird();
        ref.show();

        ref = new BThird();
        ref.show();
    }
}
