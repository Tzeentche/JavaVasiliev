package ClassesAndObjects;

import java.util.*;
import javax.swing.*;

class MyClass{

    int num;
    char symb;
    String text;
}

public class CreateChapterSix {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.num = 12;
        obj.symb = 'A';
        obj.text = "Text line";

        String str = "Values of object's fields: \n";
        str += " num = " + obj.num + "\n";
        str += " symb = " + obj.symb + " \n";
        str += " text = " + obj.text + " \n";

        JOptionPane.showMessageDialog(null, str);
    }
}
