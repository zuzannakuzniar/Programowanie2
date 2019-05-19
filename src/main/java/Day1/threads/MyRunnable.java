package Day1.threads;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class App2 {

    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(new MyRunnable());
        Thread t5 = new Thread(() ->
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (i)

            System.out.println(Thread.currentThread().getName()));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}