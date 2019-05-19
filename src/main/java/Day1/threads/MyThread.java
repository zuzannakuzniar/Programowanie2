package Day1.threads;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class App  {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        System.out.println(Thread.currentThread().getName());
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}