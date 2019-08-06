package ChapterThirteen;

import javax.swing.*;

class MyFrame {

    MyFrame(){

        JFrame frm = new JFrame(" Window with lable");
        frm.setBounds(400, 300, 180, 100);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl = new JLabel(" Hello to everybody!");

        frm.add(lbl);

        frm.setVisible(true);
    }
}

public class FrameAndLabel {

    public static void main(String[] args) {

        new MyFrame();
    }
}
