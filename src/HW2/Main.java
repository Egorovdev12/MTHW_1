package HW2;

import HW1.Thread1;

import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Создание объекта типа callable
        Callable<Integer> call = new MyCallable();

        // Создаём пул поток с фиксированным количеством потоков
        final ExecutorService threadPool = Executors.newFixedThreadPool(4);

        // Добивим наши потоки в пул
        final Future<Integer> task1 = threadPool.submit(call);
        final Future<Integer> task2 = threadPool.submit(call);
        final Future<Integer> task3 = threadPool.submit(call);
        final Future<Integer> task4 = threadPool.submit(call);

        System.out.println("Поток #1 завершил свое выполнение, количество сообщений: " + task1.get());
        System.out.println("Поток #2 завершил свое выполнение, количество сообщений: " + task2.get());
        System.out.println("Поток #3 завершил свое выполнение, количество сообщений: " + task3.get());
        System.out.println("Поток #4 завершил свое выполнение, количество сообщений: " + task4.get());
        threadPool.shutdown();


    }
}