package Java.Multithreading;

public class Producer implements Runnable{
    SharedResource sharedResource;

    Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<6;i++){
            sharedResource.produceResource(i);
        }
    }
}
