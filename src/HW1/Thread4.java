package HW1;

public class Thread4 extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2999);
                System.out.println("Сообщение от " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}