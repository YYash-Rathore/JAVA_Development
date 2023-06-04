package Multithreading;

public class name_priority {
    public static void main(String[] args) {
        String name1 = Thread.currentThread().getName();
        System.out.println("The name of main thread is "+name1);
        System.out.println("The Priority of main thread is "+Thread.currentThread().getPriority());

        System.out.println("*************After Changing***********");
        Thread t = Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        String name2 = Thread.currentThread().getName();
        System.out.println("The name of main thread is "+name2);
        System.out.println("The Priority of main thread is "+Thread.currentThread().getPriority());

    }
}
