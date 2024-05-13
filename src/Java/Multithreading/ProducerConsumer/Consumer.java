package Java.Multithreading.ProducerConsumer;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable{
    SharedResource sharedResource;

    Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for(int i=0;i<6;i++){
            sharedResource.consumeResource();
        }
    }
}
