package ChapterEight;

import javax.swing.*;

class Base {

    private String name;
    private int number;

    Base(String name, int number) {

        this.name = name;
        this.number = number;
    }

    private void show() {

        System.out.println("Object with name " + name);
    }

    void showAll() {

        show();
        System.out.println("Numeric field of object equals " + number);
    }

    void setAll(String name, int number) {

        this.name = name;
        this.number = number;
    }
}

class SubBase extends Base {

    SubBase(String str, int num){

        super(str,num);
        showAll();
    }
}

public class PrivateClasses {

    public static void main(String[] args) {

        SubBase obj = new SubBase("NEW", 1);
        obj.setAll("EQUALS", 2);

        obj.showAll();
    }
}
