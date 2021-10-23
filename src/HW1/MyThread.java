package HW1;

public class MyThread extends Thread {

    private int milliseconds;

    public MyThread(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(milliseconds);
                System.out.println("Сообщение от " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
