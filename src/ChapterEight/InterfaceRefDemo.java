package ChapterEight;

import javax.swing.*;

interface BaseThird {

    void show();
}

class A implements BaseThird {

    public void show() {

        System.out.println("It is method of A-class!");
    }
}

class B implements BaseThird {

    public void show() {

        System.out.println("It is method of B-class!");
    }
}

public class InterfaceRefDemo {

    public static void main(String[] args) {

        BaseThird ref;

        ref = new A();
        ref.show();

        ref = new B();
        ref.show();
    }
}
