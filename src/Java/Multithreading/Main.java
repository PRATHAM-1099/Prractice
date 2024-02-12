package Java.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        SharedResource s = new SharedResource(3);
//        SharedResource s1 = new SharedResource(3);
//
//        Thread t1 = new Thread(new Consumer(s));
//
//        Thread t2 = new Thread(new Producer(s));
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("main thread finished");

        Thread d = new Thread(() -> {
            for(int i=0;i<5;i++){
                try{
                    sleep(1000);
                }
                catch (InterruptedException e) {

                }
                System.out.println("Creating deamon thread");
            }
        });

        d.setDaemon(true);
        //Daemon thread: Java Garbage collector, auto save, Logging

        d.start();
        d.join();

        //stop, resume and suspend method are deprecated in java


        //Monitor Lock is acquired on an object so for shared resources we need to use other locking mechanism
        //Reentrant, Read-Write, Semaphore, Stamp
        ReentrantLock rl = new ReentrantLock();
        ReadWriteLock rwl = new ReentrantReadWriteLock(); //Shared and Exclusive lock

        //Optimistic Locking uses concept of versioning to update the data
        //Stamp lock supports optimistic locking functionality

        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();

        lock.validate(stamp);

        //Semaphore lock we can tell how many threads can acc a particular resource
        //await() and signal()

        Condition condition = rl.newCondition();
        condition.await();
        condition.signal();

        //Lock free mechanism compare and swap CAS, like AtomicInteger Read, Modify and update then use CAS
        AtomicInteger ai = new AtomicInteger(0);

    }
}
