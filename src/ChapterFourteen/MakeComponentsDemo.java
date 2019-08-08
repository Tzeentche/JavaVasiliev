package ChapterFourteen;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyButton extends JButton {

    private MyFrames frame;

    MyButton(MyFrames frame, boolean state) {

        super();
        this.frame = frame;

        String fileName;
        String bName;

        if (state) {

            fileName = "Yes.png";
            bName = "Yes";

            addActionListener(new HandlerYes(frame));

        } else {

            fileName = "No.png";
            bName = "No";
            addActionListener(new HandlerNo());
        }

        fileName = "d:\\books\\files\\" + fileName;

        ImageIcon icn = new ImageIcon(fileName);
        setIcon(icn);
        setText(bName);
        setFocusPainted(false);

        int w = frame.getWidth() / 4;
        int h = frame.getHeight() / 8;

        setSize(w, h);

        int x = frame.getWidth() / 4, y = frame.getHeight() - h - 50;

        if (!state) x += w + 50;
        setLocation(x, y);
        frame.add(this);
    }
}

    class MyIconLabel extends JLabel {

        private MyFrames frame;

        MyIconLabel(MyFrames frame) {

            super();

            this.frame = frame;

            ImageIcon icn = new ImageIcon("d:\\books\\files\\rabbit.gif");

            setIcon(icn);
            setBounds(5, 15, frame.getWidth() / 4 - 10, frame.getHeight() - 30);

            frame.add(this);
        }
    }

    class MyMenuBar extends JMenuBar {

        private MyFrames frame;

        MyMenuBar(MyFrames frame) {

            super();

            this.frame = frame;

            JMenu wind = new JMenu("Window");
            JMenuItem apply = new JMenuItem("Agree");
            JMenuItem exit = new JMenuItem("Exit");

            apply.addActionListener(new HandlerYes(frame));
            exit.addActionListener(new HandlerNo());

            wind.add(apply);
            wind.add(exit);
            add(wind);

            JMenu horiz = new JMenu("By Horizon");
            JMenuItem left = new JMenuItem("Left");
            JMenuItem right = new JMenuItem("Right");
            JMenuItem hnone = new JMenuItem("Hold the place");

            left.addActionListener(new MenuHandler(frame, true));
            right.addActionListener(new MenuHandler(frame, true));
            hnone.addActionListener(new MenuHandler(frame, true));

            horiz.add(left);
            horiz.add(right);
            horiz.add(hnone);

            add(horiz);

            JMenu vert = new JMenu("By Vertical");
            JMenuItem up = new JMenuItem("Up");
            JMenuItem down = new JMenuItem("Down");
            JMenuItem vnone = new JMenuItem("Hold the place");

            up.addActionListener(new MenuHandler(frame, false));
            down.addActionListener(new MenuHandler(frame, false));
            vnone.addActionListener(new MenuHandler(frame, false));

            vert.add(up);
            vert.add(down);
            vert.add(vnone);

            add(vert);

            setBounds(1, 1, frame.getWidth() - 1, frame.getHeight() / 10);

            frame.add(this);
        }
    }

    class MyPanel extends JPanel {

        public JLabel HLab;
        public JLabel VLab;

        MyPanel() {

            super();

            JLabel L1 = new JLabel("By Horizon: ");
            JLabel L2 = new JLabel("By Vertical: ");

            HLab = new JLabel("Hold the place");
            VLab = new JLabel("Hold the place");

            setLayout(new GridLayout(2, 2, 3,3));

            add(L1);
            add(HLab);
            add(L2);
            add(VLab);
        }
    }

    class MyFrames extends JFrame {

        public MyPanel move;

        private int[] step;

        public void setH(int i) {

            step[0] = i;
        }

        public void setV(int i) {

            step[1] = i;
        }

        MyFrames(String text, int width, int height){

            super();

            step = new int[] {0, 0};

            setTitle(text);

            setBounds(400,300, width, height);

            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            new MyButton(this, true);
            new MyButton(this, false);

            new MyMenuBar(this);

            new MyIconLabel(this);

            JLabel msg = new JLabel("Do you want to move the window?");
            msg.setBounds(getWidth() / 4, 15, 3 * getWidth() / 4 - 10, getHeight() / 4 - 5);

            Font fnt = new Font("Arial", Font.BOLD, 18);
            msg.setFont(fnt);

            add(msg);

            move = new MyPanel();

            move.setBounds(msg.getX(), msg.getY() + msg.getHeight() + 1, msg.getWidth(), msg.getHeight());

            add(move);

            setResizable(false);

            setVisible(true);
        }

        void handler() {

            setLocation(getX() + step[0], getY() + step[1]);
        }
    }

    class HandlerNo implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            System.exit(0);
        }
    }

    class HandlerYes implements ActionListener {

        private MyFrames frame;

        HandlerYes(MyFrames frame) {

            this.frame = frame;
        }

        public void actionPerformed(ActionEvent ae) {

            frame.handler();
        }
    }

    class MenuHandler implements ActionListener {

        private MyFrames frame;

        private boolean dir;

        MenuHandler(MyFrames frame, boolean dir) {

            this.frame = frame;
            this.dir = dir;
        }

        public void actionPerformed(ActionEvent ae) {

            String cmd = ae.getActionCommand();

            if(dir) {

                frame.move.HLab.setText(cmd.toLowerCase());

                if(cmd.equalsIgnoreCase("Right")) frame.setH(50);

                else if(cmd.equalsIgnoreCase("Left")) frame.setH(-50);

                else frame.setH(0);
            }

            else {

                frame.move.VLab.setText(cmd.toLowerCase());

                if(cmd.equalsIgnoreCase("Up")) frame.setV(-50);

                else if(cmd.equalsIgnoreCase("Down")) frame.setV(50);

                else frame.setV(0);
            }
        }
    }

public class MakeComponentsDemo {

    public static void main(String[] args) {

        new MyFrames(" Service by moving window \" Fast Rabbit\"...", 380, 180);
    }
}

