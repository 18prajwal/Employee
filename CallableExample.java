import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.*;

class MyThread implements Callable<Integer>{

    public void run() {
        System.out.println("Name of the thread "+Thread.currentThread().getName());

    }

    @Override
    public Integer call() throws Exception {

        Thread.sleep(1000);
        Random random=new Random();
        return random.nextInt();
    }
}

class CallableExample{
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService service=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Future> arrayList= new ArrayList<>(10);

        for(int i=0;i<100;i++){

           Future<Integer> futureTask= service.submit(new MyThread());
           arrayList.add(futureTask);

        }

        System.out.println("waiting");


        for (Future l1:arrayList) {
           System.out.println(l1.get() + "  " + Thread.currentThread().getName());

        }
        service.shutdown();


    }
}

