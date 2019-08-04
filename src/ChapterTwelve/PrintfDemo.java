package ChapterTwelve;

import java.util.*;

public class PrintfDemo {

    public static void main(String[] args) {

        String text = "Text string";

        double x = 100.0 / 7.0;
        double z = 130;
        int n = 1234567;
        int k = 7654321;
        int m = 0xABC;
        int l = 0123;

        Date now = new Date();

        System.out.println("%s\t%d\t%f\n" + text + " " + k + " " + z);
        System.out.println("Decimal numbers:\n%1$g\t%2$e\t%1$07.2f\n " + x + " " + z);
        System.out.println("Negative numbers: %,(d\n " + n);
        System.out.println("Positive numbers: %+,d\n " + k);
        System.out.println("16-th value number %x equals 10-th value number %<d\n " + m);
        System.out.println("10-th value number %d equals 16-th value number %<X\n " + k);
        System.out.println("8-th value number %o equals 10-th value number %<d\n " + l);
        System.out.println("Month: %tB\n" + now);
        System.out.println("Date: %te\n" + now);
        System.out.println("The day of week: %tA\n" + now);
        System.out.println("Time: %tT\n" + now);
    }
}
