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

       
    }
}
