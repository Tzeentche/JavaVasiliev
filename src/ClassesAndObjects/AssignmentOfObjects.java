package ClassesAndObjects;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

class AssignObj {

    String text;

    AssignObj() {

        text = "New object!";
    }

    AssignObj(String str) {

        text = str;
    }

    void show() {

        JOptionPane.showMessageDialog(null, text);
    }
}

public class AssignmentOfObjects {

    public static void main(String[] args) {

        AssignObj objA = new AssignObj();
        AssignObj objB = new AssignObj("Second object!");

        objA.show();
        objB.show();

        objA = objB;
        objA.show();

        objB.text = "Second object was changed!";

        objA.show();
    }
}
