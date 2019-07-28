package ChapterEight;

import javax.swing.*;

class BaseSecond {

    String name;

    BaseSecond(String name) {

        this.name = name;
    }

    void show() {

        System.out.println("Superclass object: " + name);
    }

    void sayHello() {

        System.out.println("Hello to everybody!");
    }
}

class SubBaseSec extends BaseSecond {

    char code;

    SubBaseSec(String name, char code){

        super(name);
        this.code = code;
    }

    void show() {

        System.out.println("Subclass object: " + name + ". Code: " + code);
    }
}

public class SubRefDemo {

    public static void main(String[] args) {

        BaseSecond obj;

        obj = new BaseSecond("Based");

        obj.sayHello();
        obj.show();

        obj = new SubBaseSec("Produced", 'A');
        obj.sayHello();
        obj.show();
    }
}
