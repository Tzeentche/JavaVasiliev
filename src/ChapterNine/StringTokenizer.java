package ChapterNine;

import java.util.*;

public class StringTokenizer {

    public static void main(String[] args) {

        String text = "Wery simple text: contains with words< without numbers!";

        StringTokenizer str = new StringTokenizer(text);

        String s;

        while(str.hasMoreTokens()) {

            s = str.nextToken();

            System.out.println(s);
        }
    }
}
