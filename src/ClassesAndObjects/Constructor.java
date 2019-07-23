package ClassesAndObjects;

import javax.swing.*;
import java.lang.*;

class FourthClass {

    int num;
    char symb;
    String text;

    FourthClass(int n, char s, String str) {

        set(n, s, str);
        showText();
    }

    void showText(){

        String str = "Value of object's fields: \n";

        str += " num " + num + " \n";
        str += " symb " + symb + " \n";
        str += " text = " + text;

        JOptionPane.showMessageDialog(null, str);
    }

    void set(int n, char s, String str) {

        num = n;
        symb = s;
        text = str;
    }
}

public class Constructor {

    public static void main(String[] args) {

        FourthClass obj = new FourthClass(15, 'S', "Just text.");
    }
}
