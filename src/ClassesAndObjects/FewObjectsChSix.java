package ClassesAndObjects;

import javax.swing.*;

class ThirdClass {

    int num;
    char symb;
    String text;

    void showText() {

        String str = "Values of object's fields : \n";

        str += " num " + num + " \n";
        str += " symb " + symb + " \n";
        str += " text " + text;

        JOptionPane.showMessageDialog(null, str);
    }

    void set(int n, char s, String str) {

        num = n;
        symb = s;
        text = str;
    }
}
public class FewObjectsChSix {

    public static void main(String[] args) {

        ThirdClass obj1 = new ThirdClass();
        ThirdClass obj2 = new ThirdClass();

        obj1.set(10, 'A', "Hello to everyone");
        obj2.set(200, 'b', "Hello once more!");

        obj1.showText();
        obj2.showText();
    }
}
