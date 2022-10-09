class MyThread extends Thread {

    public void run() {
        System.out.println("Name of the thread "+Thread.currentThread().getName());

    }
}


class TenTaskTenThread {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<10;i++) {
            MyThread t1=new MyThread();
            t1.start();
        }
    }

}


