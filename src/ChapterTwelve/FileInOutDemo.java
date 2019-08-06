package ChapterTwelve;

import java.io.*;

public class FileInOutDemo {

    public static void main(String[] args) throws IOException {

        try {

            FileInputStream fis = new FileInputStream("D:/Books/Files/base.txt");

            FileOutputStream fos = new FileOutputStream("D:/Books/Files/data.txt", true);

            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "windows-1251"));

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            String str;

            do {
                str = br.readLine();
                System.out.println(str);

                bw.newLine();

                bw.write(str.toLowerCase().replace(' ','_'));
            } while (!str.equalsIgnoreCase("Omar Chayam"));

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {

            System.out.println("File not found! " + e);
        }
    }
}
