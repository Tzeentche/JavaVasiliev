package arrays.ObjectsAndMethods;

import javax.swing.*;

class Fellow {

    String name;
    String surname;
    int age;
    double weight;

    Fellow(String name,String surname,int age, double weight) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        show();
    }

    void show() {

        String str = "Name: " + name + " \n";
        str += "Surname: " + surname + " \n";
        str += "Age: " + age + " \n";
        str += "Weight: " + weight + " kg";

        JOptionPane.showMessageDialog(null, str);
    }
}

public class CommandLineArgues {

    public static void main(String[] args) {

        String name = args[0];
        String surname = args[1];
        int age = Integer.parseInt(args[2]);
        double weight = Double.parseDouble(args[3]);

        new Fellow(name, surname, age, weight);
    }
}
