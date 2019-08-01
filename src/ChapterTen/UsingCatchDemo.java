package ChapterTen;

import java.util.*;

public class UsingCatchDemo {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] array = {0, 1, 2, 3, 4, 5, 0, 8, 10, 12, 15};

        int n = 120, count = 0;

        while(count < 5) {

            try {

                System.out.println(n / array[rnd.nextInt(array.length + 2) - 1] + " ");

            } catch(ArithmeticException eObj) {

                System.out.println("\n Mistake: divide by 0! Overview: " + eObj);

                count ++;
            } catch(ArrayIndexOutOfBoundsException eObj) {

                System.out.println("\n Mistake: wrong index! Overview: " + eObj);

                count ++;
            }

        }
    }
}
