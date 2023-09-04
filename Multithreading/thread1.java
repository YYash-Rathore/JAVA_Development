package Multithreading;

class myThread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}

public class thread1 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        myThread t = new myThread();
        t.start();
    }
}
