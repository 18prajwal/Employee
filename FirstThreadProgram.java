class MyThread extends Thread{
    public void run(){
        System.out.println("custom " +Thread.currentThread().getName());
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i +Thread.currentThread().getName());
        }
    }

}


class FirstThreadProgram {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main "+Thread.currentThread().getName());
        MyThread t1=new MyThread();
        t1.setName(" MyThread");
        t1.start();
        t1.join();
        for(int i=0;i<=10;i++){

            System.out.println(i +" "+Thread.currentThread().getName());
        }

    }
}
