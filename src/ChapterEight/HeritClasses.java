package ChapterEight;

import javax.swing.*;

class SuperClass {

    int number;
    String name;

    void setNumber(int n) {

        number = n;
    }
}

class SubClass extends SuperClass {

    char symbol;

    void setAll(int n, String txt, char s) {

        setNumber(n);
        name = txt;
        symbol = s;
    }

    void show() {

        System.out.println("Values field: " + number);
        System.out.println("Text number: " + name);
        System.out.println("Symbol field: " + symbol);
    }
}

public class HeritClasses {

    
}
