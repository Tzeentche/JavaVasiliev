package ChapterEight;

import javax.swing.*;

class BaseClass {

    String text;
    void show() {

        System.out.println(text);
    }
}

interface InterfaceA {

    String getText();
    void set(String text);
}

interface InterfaceB {

    void showText();
}

class SubBase extends Base implements InterfaceA, InterfaceB {

    public String getText() {

        return text;
    }

    public void set(String text) {

        this.text = text;
    }

    public void showText() {

        System.out.println("Text field: ");

        show();
    }
}

//      public class SomeInterfaces {

//      }
