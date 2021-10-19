package HW1;

public class Thread3 extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2850);
                System.out.println("Сообщение от " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}