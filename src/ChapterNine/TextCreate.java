package ChapterNine;

public class TextCreate {

    public static void main(String[] args) {

        String str1 = new String("Text literal");
        System.out.println(str1);

        String str2 = new String(str1);
        System.out.println(str2);

        String str3 = new String();
        System.out.println(str3);

        char[] symbs = new char[] {'A','r','r','a','y'};
        String str4 = new String(symbs);
        System.out.println(str4);

        byte[] nums = new byte[] {78, 117, 109, 98, 101, 114, 115};
        String str5 = new String(nums);
        System.out.println(str5);
    }
}
