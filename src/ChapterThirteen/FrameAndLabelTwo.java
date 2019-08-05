package ChapterThirteen;

import javax.swing.*;

class MyFrameTwo {

    MyFrameTwo(String text, int x, int y) {

        JFrame frm = new JFrame("Window with label");

        frm.setBounds(x, y, 250, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icn = new ImageIcon("d:/Books/Java_guide/pictures/redshd.gif");
        JLabel lbl = new JLabel(text, icn, JLabel.CENTER);

        frm.add(lbl);

        frm.setVisible(true);
    }
}

public class FrameAndLabelTwo {

    public static void main(String[] args) {

        new MyFrameTwo(" Label with pict!", 300, 400);
    }
}
