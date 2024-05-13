package Java.Multithreading.SharedResource;

import static java.lang.Thread.sleep;

public class SharedResource {

    boolean isAvailable = false;

    synchronized void produce(){

        isAvailable = true;
        System.out.println("Make item available " + Thread.currentThread().getName());
        notifyAll();
    }

    synchronized void consume(){
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(!isAvailable){
            try {
                System.out.println("Waiting for the item " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Item is available " + Thread.currentThread().getName());
        isAvailable=false;
    }

}
