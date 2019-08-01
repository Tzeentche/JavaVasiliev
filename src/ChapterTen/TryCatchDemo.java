package ChapterTen;

import java.util.*;

public class TryCatchDemo {

    public static void main(String[] args) {

        int n = 3;
        int count = 0, nums = 0;
        int a, b;

        Random rnd = new Random();

        while(count < n) {

            nums ++;

            try {

                a = rnd.nextInt(10);
                b = rnd.nextInt(6);

                System.out.println(nums + ")Result of divide on number: " + a + " / " + b + " = ");

                System.out.println( a / b);

            } catch(ArithmeticException eObj) {

                System.out.println("Infinity!");

                System.out.println("Attention!It's mistake gone: " + eObj);

                count ++;
            }
        }

        System.out.println("The value of mistakes is: " + n + ". Program work was finished!");
    }
}
