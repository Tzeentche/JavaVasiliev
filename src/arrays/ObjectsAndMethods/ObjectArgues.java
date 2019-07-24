package arrays.ObjectsAndMethods;

import javax.swing.*;

class SixthClass {

    int number;
    char symb;

    SixthClass(int number, char symb) {

        this.number = number;
        this.symb = symb;
    }

    void show() {

        System.out.println("Object's fields: " + number + " and " + symb);
    }
}

class ArgsDemo {

    static void MakeChange(SixthClass obj) {

        obj.number ++;
        obj.symb ++;

        String text = "Argument-object : fields " + obj.number + " and " +obj.symb;

        System.out.println(text);
    }

    static void MakeChange(int number, char symb) {

        number ++;
        symb ++;

        String text = "Argues of base typrs: values " + number + " and " + symb;

        System.out.println(text);
    }
}

public class ObjectArgues {

    public static void main(String[] args) {

//        SixthClass obj = new SixthClass(1, 'a');
//        obj.show();
//        MakeChange(obj);
//        obj.show;
//        MakeChange(obj.number,obj.symb);
//        obj.show();
    }
}
