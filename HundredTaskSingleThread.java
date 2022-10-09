import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {

    public void run() {
        System.out.println("Name of the thread "+Thread.currentThread().getName());
    }

}

class HundredTaskSingleThread {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service=Executors.newSingleThreadExecutor();
        for (int i=0;i<100;i++) {

           MyThread t=new MyThread();
           service.execute(t);


        }


        }


}


