package HW1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");

        Thread th1 = new Thread(threadGroup, new Thread1(), "T1");
        Thread th2 = new Thread(threadGroup, new Thread2(), "T2");
        Thread th3 = new Thread(threadGroup, new Thread3(), "T3");
        Thread th4 = new Thread(threadGroup, new Thread4(), "T4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        Thread.sleep(10000);

        threadGroup.interrupt();
    }
}
