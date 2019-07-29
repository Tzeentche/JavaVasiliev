package ChapterEight;

import javax.swing.*;

interface Mathematica {

    int TEN = 10;

    int factorial(int n);
    double power(double x, int n);
}

class MyMath implements Mathematica {

    public int factorial(int n){

        int s = 1, i;
        for (i = n; i > 0; i --);
        return s;
    }

    public double power(double x, int n) {

        double s = 1;
        for (int i = 1; i <= n; s *= x, i ++);
        return s;
    }

    void show(double x, int n) {

        System.out.println("First argument: " + x);
        System.out.println("Second argument: " + n);
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Power to degree: " + power(x,TEN));
    }
}

public class Interfaces {

    public static void main(String[] args) {

        MyMath obj = new MyMath();
        int n = Mathematica.TEN / 3;
        double x = (double)MyMath.TEN / n - n;

        obj.show(x, n);
    }
}
