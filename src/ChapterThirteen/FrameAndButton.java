package ChapterThirteen;

import javax.swing.*;
import java.awt.event.*;

class MyFrameThird implements ActionListener {

    MyFrameThird (String text, int x, int y) {

        JFrame frm = new JFrame("Window with label and button!");
        frm.setBounds(x, y, 360, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icn = new ImageIcon(":/Books/Java_guide/pictures/javalogo.gif");

        JLabel lbl = new JLabel(text, icn, JLabel.CENTER);
        lbl.setBounds(10, 10, 330, 100);

        JButton btn = new JButton("I understand it!");
        btn.setBounds(90, 120, 180, 30);
        btn.addActionListener(this);

        frm.setLayout(null);
        frm.add(lbl);
        frm.add(btn);
        frm.setVisible(true);
    }

    public void actionPerformed(ActionEvent AEobj) {

        System.exit(0);
    }
}

public class FrameAndButton {

    public static void main(String[] args) {

        new MyFrameThird("Window with label, pict and button!", 400, 250);
    }
}
