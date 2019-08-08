package ChapterFifteen;

import java.awt.*;
import javax.swing.*;

public class AppletWithParams extends JApplet {

    public void init() {

        String text = "<html> Using font size ";

        int size = Integer.parseInt(getParameter("size"));

        Font fnt = new Font("Arial", Font.BOLD, size);

        text += size + " .<br>";

        Color clr;

        String clrName = getParameter("color");

        if(clrName.equalsIgnoreCase("blue")) clr = Color.BLUE;

        else if(clrName.equalsIgnoreCase("red")) clr = Color.RED;
        else if(clrName.equalsIgnoreCase("yellow")) clr = Color.YELLOW;
        else if(clrName.equalsIgnoreCase("green")) clr = Color.GREEN;
        else clr = Color.GRAY;

        getContentPane().setBackground(clr);

        text += "Font color: " + clrName.toLowerCase() + ".</html>";

        JLabel lb = new JLabel(text, JLabel.CENTER);

        lb.setFont(fnt);

        add(lb);
    }
}
