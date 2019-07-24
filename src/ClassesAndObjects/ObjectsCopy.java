package ClassesAndObjects;

import javax.swing.*;

class MakeObjCopy {

    String name;
    int number;

    MakeObjCopy(String str, int num) {

        name = str;
        number = num;
    }

    MakeObjCopy(MakeObjCopy obj) {

        name = obj.name;
        number = obj.number;
    }

    MakeObjCopy copy() {

        MakeObjCopy tmp = new MakeObjCopy(name, number);

        return tmp;
    }

    void show() {

        String text = " Object's fields: \n";
        text += " name: " + name + " \nnumber:" + number;

        System.out.println(text);
    }
}
public class ObjectsCopy {

    public static void main(String[] args) {

        MakeObjCopy objA = new MakeObjCopy("First object", 100);
        MakeObjCopy objB = new MakeObjCopy(objA);

        objA.show();
        objB.show();

        objB.name = "Second object";
        objB.number = 200;

        objA.show();
        objB.show();

        objA = objB.copy();

        objA.show();

        objB.name ="Second object changed!";
        objB.number = 300;

        objA.show();
        objB.show();
    }
}
