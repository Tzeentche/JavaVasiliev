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

        set(n);

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

    void set(){

        num = 0;
        symb = 'A';
        text = "There are no arguments.";
    }

    void set(int n){

        num = n;
        symb = 'B';
        text = "There is INTEGER argument.";
    }

    void set(char s){

        num = 1;
        symb = s;
        text = "There are CHAR argument.";
    }

    void set(int n, char s, String str){

        num = n;
        symb = s;
        text = str;
    }
}
public class Overloading {

    public static void main(String[] args) {

        FifthClass obj1 = new FifthClass();
        FifthClass obj2 = new FifthClass(2);
        FifthClass obj3 = new FifthClass('Z');
        FifthClass obj4 = new FifthClass(3, 'D', "There are three arguments. ");
    }
}
