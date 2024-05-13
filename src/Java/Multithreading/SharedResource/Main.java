package Java.Multithreading.SharedResource;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        SharedResource s = new SharedResource();

        Thread t1 = new Thread(s::consume);
        Thread t2 = new Thread(s::produce);

        t2.start();
        t1.start();


        t1.join();
        t2.join();

        System.out.println("Main thread ended");

    }


}
