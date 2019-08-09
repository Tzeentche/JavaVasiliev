package ChapterFifteen;

import javafx.scene.control.TextFormatter;
import sun.applet.Main;
import sun.font.Font2DHandle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class SimpleTextPanel extends JPanel {

    SimpleTextPanel(String text) {

        super();

        JLabel lbl = new JLabel(text, JLabel.CENTER);
        lbl.setFont(new Font("Monospaced", Font.BOLD + Font.ITALIC, 15));

        add(lbl);
    }
}

class MainTextPanel extends JPanel {

    private JLabel MainText;

    public void setMainText(String text) {
        MainText.setText(text);
    }

    public void setMainFont(Font fnt) {
        MainText.setFont(fnt);
    }

    MainTextPanel(String text, Font fnt) {

        super();

        setBorder(BorderFactory.createEtchedBorder());

        MainText = new JLabel(text, JLabel.CENTER);
        MainText.setFont(fnt);
        add(MainText);
    }
}

class FontTypePanel extends JPanel {

    private JComboBox FontTypeList;

    public String getFontType() {

        return(String)FontTypeList.getSelectedItem();
    }

    FontTypePanel(ActionListener hnd) {

        super();

        setBorder(BorderFactory.createEtchedBorder());

        setLayout(new GridLayout(5, 1, 2, 2));

        add(new JLabel("Choose type of font: "));

        String[] fonts = {"Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif"};

        FontTypeList = new JComboBox(fonts);

        FontTypeList.addActionListener(hnd);

        add(FontTypeList);
    }
}

class FontStylePanel extends JPanel {

    private JRadioButton normal, italic, bold, it_bold;

    public int getFontStyle() {

        if(normal.isSelected()) return Font.PLAIN;
        if(italic.isSelected()) return Font.ITALIC;
        if(bold.isSelected()) return Font.BOLD;

        else return Font.ITALIC + Font.BOLD;
    }

    FontStylePanel(ActionListener hnd) {

        super();

        setBorder (BorderFactory.createEtchedBorder());
        setLayout(new GridLayout(5, 1, 2, 2));

        add(new JLabel("Choose font style: "));

        ButtonGroup rbg = new ButtonGroup();

        normal = new JRadioButton("Usual", true);
        normal.addActionListener(hnd);

        rbg.add(normal);
        add(normal);

        italic = new JRadioButton("Curve", false);
        italic.addActionListener(hnd);

        rbg.add(italic);
        add(italic);

        bold = new JRadioButton("Bold", false);
        bold.addActionListener(hnd);

        rbg.add(bold);
        add(bold);

        it_bold = new JRadioButton("Bold curve", false);
        it_bold.addActionListener(hnd);

        rbg.add(it_bold);
        add(it_bold);
    }
}

class FontSizePanel extends JPanel {

    private JSpinner FontSize;

    public int getFontSize() {

        return (Integer)FontSize.getValue();
    }

    FontSizePanel(ChangeListener hnd) {

        super();

        setBorder(BorderFactory.createEtchedBorder());

        setLayout(new GridLayout(5, 1, 2, 2));

        add(new JLabel("Choose size of font: "));

        SpinnerNumberModel snm = new SpinnerNumberModel(15, 15, 25, 1);

        FontSize = new JSpinner(snm);

        FontSize.addChangeListener(hnd);
        add(FontSize);
    }
}

class FontPanel extends JPanel {

    private FontTypePanel FTP;

    private FontStylePanel FSP;

    private FontSizePanel FZP;

    public Font newFont() {

        return new Font(FTP.getFontType(), FSP.getFontStyle(), FZP.getFontSize());
    }

    FontPanel(ActionListener hnd1, ChangeListener hnd2) {

        super();

        setLayout(new GridLayout(1, 3, 2, 2));

        FTP = new FontTypePanel(hnd1);
        FSP = new FontStylePanel(hnd1);
        FZP = new FontSizePanel(hnd2);

        add(FTP);
        add(FSP);
        add(FZP);
    }
}

class TextPanel extends JPanel {

    public JTextField TF;

    public JCheckBox CB;

    public JButton BT;

    TextPanel(ActionListener hnd) {

        super();

        setLayout(new GridLayout(4, 1, 2, 2));

        setBorder(BorderFactory.createEtchedBorder());

        CB = new JCheckBox("Change value of text", false);
        CB.addActionListener(hnd);

        TF = new JTextField();
        TF.setEnabled(false);

        BT = new JButton("Agree");
        BT.addActionListener(hnd);
        BT.setEnabled(false);

        add(CB);

        add(new JLabel(" Field for enter text:"));

        add(TF);
        add(BT);
    }
}

class TPanel extends JTabbedPane {

    public FontPanel FP;
    public TextPanel TP;

    TPanel(ActionListener hnd1, ChangeListener hnd2, ActionListener hnd3) {

        super();

        FP = new FontPanel(hnd1, hnd2);

        addTab("Choose font", FP);

        TP = new TextPanel(hnd3);

        addTab("Use text", TP);
    }
}

public class SoBigApplet extends JApplet {

    private TPanel tpnl;

    private SimpleTextPanel stp;

    private MainTextPanel mtp;

    public void init() {

        FontHandler fhnd = new FontHandler();

        TextHandler thnd = new TextHandler();

        setLayout(null);

        int w, h;

        w = getWidth();
        h = getHeight();

        tpnl = new TPanel(fhnd, fhnd, thnd);

        tpnl.setBounds(0, 0, w, 3 * h / 5);

        stp = new SimpleTextPanel("Simple of the text:");
        stp.setBounds(0, 3 * h / 5, w, h / 5);

        mtp = new MainTextPanel("A text string is displayed here", tpnl.FP.newFont());
        mtp.setBounds(0, 4 * h / 5, w, h / 5);

        add(tpnl);
        add(stp);
        add(mtp);
    }

    class FontHandler implements ActionListener, ChangeListener {

        private void applyFont() {

            mtp.setMainFont(tpnl.FP.newFont());
        }

        public void actionPerformed(ActionEvent ae) {

            applyFont();
        }

        public void stateChanged(ChangeEvent ce) {

            applyFont();
        }
    }

    class TextHandler implements ActionListener {

        private void OffOn(boolean state) {

            tpnl.TP.CB.setSelected(state);
            tpnl.TP.TF.setEnabled(state);
            tpnl.TP.BT.setEnabled(state);
        }

        public void actionPerformed(ActionEvent ae) {

            String ac = ae.getActionCommand();

            if (ac.equalsIgnoreCase(tpnl.TP.BT.getText())) {

                mtp.setMainText(tpnl.TP.TF.getText());

                OffOn(false);

            } else OffOn(tpnl.TP.CB.isSelected());
        }
    }
}
