package arrays.ObjectsAndMethods;

import javax.swing.*;

class First {

    int[] nums;

    First(int n) {

        nums = new int[n];

        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i < n; i ++) {

            nums[i] = nums[i - 1] + nums[i - 2];
        }
    }

    void show() {

        for (int i = 0; i < nums.length; i ++) {

            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}

class Second {

    First obj;

    Second(int n) {

        obj = new First(n);

        obj.show();
    }
}

public class ArraysAndObjects {

    public static void main(String[] args) {

        int count = 5;

        Second[] ObjAr = new Second[count];

        for (int i = 0; i < ObjAr.length; i ++) {

            ObjAr[i] = new Second(3 * i + 4);
        }
    }
}
