package HW2;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int randomInt = new Random().nextInt(10);
        try {
            for (int i = 0; i < randomInt; i++) {
                Thread.sleep(2500);
                System.out.println("Сообщение от " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
        return randomInt;
    }
}