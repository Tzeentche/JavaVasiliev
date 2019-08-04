package ChapterTwelve;

import java.util.*;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int age;
        double weight;

        System.out.println("What is your name?");

        name = input.nextLine();
        System.out.println("Good morning, " + name + "!");
        System.out.println("How old are you? ");

        age = input.nextInt();

        System.out.println("You are " + age + "years old!");
        System.out.println("Enter your weight (in kg.): ");

        weight = input.nextDouble();

        System.out.println("Your weight is " + weight +"kg.");
    }
}
