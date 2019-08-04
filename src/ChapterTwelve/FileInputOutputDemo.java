package ChapterTwelve;

import java.io.*;
import javax.swing.*;

public class FileInputOutputDemo {

    public static void main(String[] args) throws IOException {

        String FilePath = "D:/Books/Files";
        FilePath += JOptionPane.showInputDialog("Set thefile'sname");

        try {

            FileInputStream fin = new FileInputStream(FilePath);

            FileOutputStream fout = new FileOutputStream("D:/Books/Files/result.txt");

            int s = fin.read();

            while(s != - 1) {

                switch(s) {

                    case 'T':
                    s ='t';
                    break;

                    case '.':
                        fout.write('<');
                        fout.write('*');
                        s ='>';
                        break;
                }

                fout.write(s);
                s = fin.read();
            }

            JOptionPane.showMessageDialog(null, "Changes in file get's!", "Program's work is end", JOptionPane.INFORMATION_MESSAGE);

            fin.close();
            fout.close();
        } catch(FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "That's file wasn't!", "It's mistake!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
