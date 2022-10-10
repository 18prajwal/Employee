import javax.xml.validation.Schema;
import java.util.concurrent.*;

class MyThread implements Runnable {

    public void run() {
        System.out.println("Running task1");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Running task3");
    }
}

class ScheduledExecutor {
    public static void main(String[] args) throws InterruptedException {

        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task2 = () -> System.out.println("Running task2");
        scheduler.schedule(task2,3,TimeUnit.SECONDS);
        t.start();
        scheduler.shutdown();
    }
}


