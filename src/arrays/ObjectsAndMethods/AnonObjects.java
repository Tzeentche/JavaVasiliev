package arrays.ObjectsAndMethods;

import javax.swing.*;

class EighthClass {

    int[] nums;

    EighthClass(int n) {

        nums = new int[n];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = i + 1;
        }
    }

        void show() {

            String text = "Natural numbers: \n";

            for (int i = 0; i < nums.length; i ++) {

                text += nums[i] + " ";

                JOptionPane.showMessageDialog(null, text);
            }
        }
    }

public class AnonObjects {

    static void show(EighthClass obj) {

        String text = "Array's elements: \n";

        int n = (int)Math.ceil(Math.sqrt(obj.nums.length));

        for (int i = 0; i < obj.nums.length - 1; i ++) {

            text += obj.nums[i] + ((i + 1) % n == 0 ? " >> next \n " : " : ");
        }

        text += obj.nums[obj.nums.length - 1] + ". The end";

        JOptionPane.showMessageDialog(null, text);
    }

    public static void main(String[] args) {

        new EighthClass(12).show();

        show(new EighthClass(24));
    }
}
