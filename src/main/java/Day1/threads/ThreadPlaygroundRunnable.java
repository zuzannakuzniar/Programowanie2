package Day1.threads;

import java.util.concurrent.TimeUnit;

public class ThreadPlaygroundRunnable implements Runnable {
    public String name;

    public ThreadPlaygroundRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {

        for (int j = 1; j < 11 ; j++) {

            System.out.println("Thread: " +Thread.currentThread().getName()
                    + "| name: " + this.name + "| i: " + j);


            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class App3 {

    private static Thread t1;
    private static Thread t2;
    private static Thread t3;
    private static Thread t4;

    public static void main(String[] args) {
        t1 = new Thread(new ThreadPlaygroundRunnable("Wątek 1"));
        t2 = new Thread(new ThreadPlaygroundRunnable("Wątek 2"));
        t3 = new Thread(new ThreadPlaygroundRunnable("Wątek 3"));
        t4 = new Thread(new ThreadPlaygroundRunnable("Wątek 4"));


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}