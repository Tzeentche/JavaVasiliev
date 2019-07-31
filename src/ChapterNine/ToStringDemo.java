package ChapterNine;

class MyOverrideClass {

    char[] code;
    int count;
    String name;

    MyOverrideClass(char[] code, int count, String name) {

        int i;

        this.code = new char[code.length];

        for(i = 0; i < code.length; i++) {

            this.code[i] = code[i];
        }

        this.count = count;

        this.name = new String(name);
    }

    public String toString() {

        String text = "Values of fields object. \n";

        text += "Field \"NAME\": " + name + "\n";
        text += "Field \"COUNT\": " + count + "\n";
        text += "Field \"CODE\": |";

        for (int i = 0; i < code.length; i++) {

            text += " " + code[i] + " |";
        }

        return text;
    }
}

public class ToStringDemo {

    public static void main(String[] args) {

        MyOverrideClass obj = new MyOverrideClass(new char[] {'Z', 'A', 'R', 'Q', 'W'}, 100, "NEW");
        System.out.println(obj);
    }
}
