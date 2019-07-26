package ChapterEight;

import javax.swing.*;

class A {

    int number;
    char symbol;

    A() {

        number = 0;
        symbol = 'A';
        System.out.println("Constructor without arguments!");
        show();
    }

    A(int n) {

        number = n;
        symbol = 'B';

        System.out.println("Constructor with one argument!");
        show();
    }

    A(int n, char s) {

        number = n;
        symbol = s;
        System.out.println("Constructor with two arguments!");
        show();
    }

    void show() {

        System.out.println("Fields " + number + " and " + symbol + " . ");
    }
}

class B extends A {

    String text;

    B() {

        super();
        text = "Without arguments";
        showText();
    }

    B(String txt) {

        super(txt.length());
        text = txt;
        showText();
    }

    B(int n, char s, String txt) {

        super(n, s);
        text = txt;
        showText();
    }

    void showText() {

        System.out.println("Text field \"" + text + "\" .");
    }
}
public class SubConstrDemo {

    public static void main(String[] args) {

        new B();
        new B("One argument");
        new B(100, 'F', "Three arguments");
    }
}
