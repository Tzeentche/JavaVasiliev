package arrays.ObjectsAndMethods;

import javax.swing.*;

class SeventhClass {

    String name;

    SeventhClass(String name) {

        this.name = name;
    }

    void show() {

        System.out.println("Object with name \"" + name + "\".");
    }
}
public class LinkType {

    static void ChangeRef(SeventhClass obj){

        SeventhClass tmp = new SeventhClass("Local object");
        obj = tmp;
        obj.show();
    }

    public static void main(String[] args) {

        SeventhClass obj = new SeventhClass("Main object");
        obj.show();
        ChangeRef(obj);

        obj.show();
    }
}
