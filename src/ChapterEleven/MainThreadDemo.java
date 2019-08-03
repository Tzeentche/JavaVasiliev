package ChapterEleven;

public class MainThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t;
        long time = 2500;

        t = Thread.currentThread();

        System.out.println(t);

        t.setName("It is a \"mainest\" thread!");

        int p = t.getPriority();

        t.setPriority(++p);

        System.out.println(t);

        System.out.println("Thread's running has stopped on " + (double)time / 1000 + " seconds.");

        Thread.sleep(time);

        System.out.println("Program's work stopped!");
    }
}
