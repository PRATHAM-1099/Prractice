package Java.Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> buffer;
    private int bufferSize;

    SharedResource(int bufferSize) {
        buffer = new LinkedList<Integer>();
        this.bufferSize=bufferSize;
    }

    public synchronized void consumeResource(){
        while(buffer.size()==0){
            System.out.println("queue is empty");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Consuming from queue");
        buffer.poll();
        notify();
    }

    public synchronized void produceResource(int i){
        while(buffer.size()==bufferSize){
            System.out.println("queue is full cannot add new products");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Adding elements to queue");
        buffer.add(i);
        notify();

    }
}
