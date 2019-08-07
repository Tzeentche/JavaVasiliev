package ChapterFourteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextInputFrame implements ActionListener {

    private JFrame frame;

    JLabel enter;
    JTextField tf;
    JButton btYes, btNo;

    private String name;

    TextInputFrame(String msg) {

        int width = 300, height = 150;
        frame = new JFrame(" Window for input text (name)...");
        frame.setBounds(400, 300, width, height);
        frame.setLayout(null);

        enter = new JLabel(msg, JLabel.LEFT);
        enter.setBounds(10, 10, width - 20, height / 6);

        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);

        btYes = new JButton("Agree");
        btYes.setBounds(10, height / 2 + 10, (width - 30) / 2, height / 6);
        btYes.setFocusPainted(false);

        btNo = new JButton("Finished");
        btNo.setBounds((width - 30) / 2 + 18, height / 2 + 10, (width - 30) / 2, height / 6);
        btNo.setFocusPainted(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        frame.setResizable(false);

        btYes.addActionListener(this);
        btNo.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String btName = ae.getActionCommand();
        if (btName.equalsIgnoreCase(btYes.getText())) {

            name = tf.getText();
            frame.setVisible(false);

            IntInputFrame.show("How old are you? Please, write your age: ", name);
        } else System.exit(0);
    }

    static void show(String txt) {

        new TextInputFrame(txt);
    }
}

    class IntInputFrame implements ActionListener, KeyListener {

        private JFrame frame;
        private JLabel enter;
        private JButton btYes, btNo;
        private JTextField tf;

        private String name;
        private int age;

        IntInputFrame(String msg, String name){

            this.name = new String(name);

            int width = 300, height = 150;

            frame = new JFrame(" Window for enter number (old)...");
            frame.setBounds(400, 300, width, height);
            frame.setLayout(null);

            enter = new JLabel(msg, JLabel.LEFT);
            enter.setBounds(10, 10, width-20, height / 6);

            tf = new JTextField(frame.getWidth() - 20);
            tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);
            tf.addKeyListener(this);

            btYes = new JButton("Agree");
            btYes.setBounds(10, height / 2 + 10, (width - 30) / 2, height / 6);
            btYes.setEnabled(false);
            btYes.setFocusPainted(false);

            btNo = new JButton("Finished");
            btNo.setBounds((width - 30) / 2 + 18, height / 2 + 10, (width - 30) / 2, height / 6);
            btNo.setFocusPainted(false);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(enter);
            frame.add(tf);
            frame.add(btYes);
            frame.add(btNo);
            frame.setResizable(false);

            btYes.addActionListener(this);
            btNo.addActionListener(this);

            frame.setVisible(true);
        }

        public void keyReleased(KeyEvent ke) {

            try {

                Integer.parseInt(tf.getText());

                btYes.setEnabled(true);
            } catch (Exception e) {

                btYes.setEnabled(false);
            }
        }

        public void keyPressed(KeyEvent ke) {}
        public void keyTyped(KeyEvent ke) {}

        public void actionPerformed(ActionEvent ae) {

            String btName = ae.getActionCommand();

            if(btName.equalsIgnoreCase(btYes.getText())) {

                age = Integer.parseInt(tf.getText());

                frame.setVisible(false);

                String msg = "Good morning, " + name + "! \n";
                msg += "Your age - " + age + " years!";

                MessageFrame.show(msg);
            }

            else System.exit(0);
        }

        static void show(String txt, String name) {

            new IntInputFrame(txt, name);
        }
    }

    class MessageFrame implements ActionListener {

        private JFrame frame;

        JLabel il;
        JLabel message;

        JButton button;

        MessageFrame(String msg) {

            int width = 350, height = 150;

            ImageIcon img = new ImageIcon("d:/Books/Files/javalogo.gif");

            frame = new JFrame(" Message...");
            frame.setBounds(400, 300, width, height);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            Image icon = frame.getToolkit().getImage("d:/Books/Files/logo.jpg");

            il = new JLabel(img);

            int w = img.getIconWidth();
            int h = img.getIconHeight();

            il.setBounds(10, 10, w, h);

            message = new JLabel("<html>" + msg.replace("\n", "<br>") + "<html>", JLabel.LEFT);
            message.setBounds(w + 20, 10, width - 30 - w, height / 2 - 10);

            frame.add(il);
            frame.add(message);

            button = new JButton("Readed!");
            button.setBounds(width / 4, 3 * height / 5, width / 2, height / 6);
            button.setFocusPainted(false);
            button.addActionListener(this);

            frame.add(button);
            frame.setResizable(false);
            frame.setIconImage(icon);
            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {

            System.exit(0);
        }

        static void show(String txt) {

            new MessageFrame(txt);
        }
    }

public class UsingFrameDemo {

    public static void main(String[] args) {

        TextInputFrame.show("What are your name? Enter your name: ");
    }
}
