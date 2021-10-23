package HW1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");

        new Thread(threadGroup, new MyThread(1500), "T1").start();
        new Thread(threadGroup, new MyThread(1700), "T2").start();
        new Thread(threadGroup, new MyThread(1900), "T3").start();
        new Thread(threadGroup, new MyThread(2500), "T4").start();

        Thread.sleep(10000);

        threadGroup.interrupt();
    }
}
