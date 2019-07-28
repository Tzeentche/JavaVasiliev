package ChapterEight;

import javax.swing.*;

abstract class AbstBase {

    String operation;

    AbstBase(String str) {

        operation = str;
    }

    abstract int F(int n);

    void show(int n) {

        System.out.println("Operation: " + operation);
        System.out.println("Argument: " + n);
        System.out.println("Value: " + F(n));
    }
}
    class BaseA extends AbstBase {

        BaseA(){

            super("Factorial");
        }

        int F(int n) {

            if (n == 1) return 1;
            else return n * F(n - 1);
        }
    }

    class BaseB extends AbstBase {

        BaseB() {

            super("Double factorial");
        }

        int F(int n) {

            if(n == 1 || n == 2) return n;

            else return n * F(n - 2);
        }
    }

public class AbstractDemo {

    public static void main(String[] args) {

        BaseA A = new BaseA();
        BaseB B = new BaseB();

        A.show(5);
        B.show(5);
    }
}
