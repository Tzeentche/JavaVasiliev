package ClassesAndObjects;

import javax.swing.*;

class NextClass {

    int num;
    char symb;
    String text;

    String showText () {

        String str = "Values of object's fields: \n";

        str += " num = " + num + "\n";
        str += " symb = " + symb + " \n";
        str += " text = " + text;

        return str;
    }
}

public class MethodsChapSix {

    public static void main(String[] args) {

        NextClass obj = new NextClass();

        obj.num = 12;
        obj.symb = 'A';
        obj.text = "Text field";

        JOptionPane.showMessageDialog(null, obj.showText());

    }
}
