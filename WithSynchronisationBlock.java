class  DemoSync{
    int count=0;
       void incre(){
          System.out.println("not synch"+Thread.currentThread().getName());
		synchronized(this){
              count++;
		}

    }
}

public class WithSynchronisationBlock{
     public static void main(String[] args) throws Exception {
         DemoSync mo = new DemoSync();
         class T1 extends Thread {

             public void run(){

                 for(int i=0;i<1000;i++){
                     mo.incre();
                 }
                 //System.out.println(mo.count);
             }

         }

         class T2 extends Thread{

            // DemoSync mo=new DemoSync();
             public void run(){
                 for(int i=0;i<1000;i++){
                     mo.incre();
                 }


             }

         }
         T1 obj=new T1();
         T2 obj1=new T2();
         obj.start();
         obj1.start();
         obj1.join();
	 obj.join();
         

         System.out.println(mo.count);


     }
}




