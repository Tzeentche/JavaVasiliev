package ChapterThirteen;

import javax.swing.*;

class NewFrame {

    NewFrame() {

        JFrame MyFrame = new JFrame("New window");

        MyFrame.setSize(300, 200);

        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyFrame.setVisible(true);
    }
}

public class NewFrameDemo {

    public static void main(String[] args) {

        new NewFrame();
    }
}
