package ClassesAndObjects;

import javax.swing.*;

class FifthClass {

    int num;
    char symb;
    String text;

    FifthClass() {

        set();

        showText();
    }

    FifthClass(int n) {

        srt(n);

        showText();
    }

    FifthClass(char s){

        set(s);

        showText();
    }

    FifthClass(int n, char s, String str) {

        set(n, s, str);

        showText();
    }

    void showText(){

        String str = "Values of object's fields ; \n";

        str += " num " + num + " \n";
        str += " symb " + symb + " \n";
        str += " text = " + text;

        JOptionPane.showMessageDialog(null, str);
    }

    void set
}
public class Overloading {

}
