import java.util.concurrent.TimeUnit;

class Number{

    public synchronized void odd() throws InterruptedException {
        for(int i=0;i<=10;i++){
            if(i%2==1){
                Thread.sleep(1000);
                System.out.println("    "+i+Thread.currentThread().getName());
            }
            else {
                notify();
                wait();
            }
        }
    }
    public synchronized void even() throws InterruptedException {
        for (int i=0;i<=10;i++){
            if(i%2==0){
                Thread.sleep(1000);
                System.out.println(i+ Thread.currentThread().getName());
            }
            else {
                notify();
                wait();
            }
        }
    }
}


public class WaitNotifyTwoThread {


    public static void main(String[] args) throws InterruptedException {
        Number n1=new Number();
      //  n1.odd();
      //  System.out.println("  ");
      //  n1.even();

        class Thread1 extends Thread{
            public void run(){

                try {
                    n1.odd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        class Thread2 extends Thread{
            public void run(){
                try {
                    n1.even();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }


        Thread1 t1=new Thread1();
        t1.setName(" Thread Odd");
        t1.start();


        Thread2 t2=new Thread2();
        t2.setName(" Thread Even");
        t2.start();
            
            
    }
    
}

