package DSA;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class MedianFinder {

    Queue<Integer> minHeap;
    Queue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((Integer a,Integer b) -> b-a);
    }

    public void addNum(int num) {

        maxHeap.add(num);
        if(maxHeap.size()>0 && minHeap.size()>0 && maxHeap.peek()>minHeap.peek()){
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }

        if(minHeap.size()+1<maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }


    }

    public double findMedian() {
        if(maxHeap.size()>minHeap.size()){
            return maxHeap.peek();
        }
        else return (double)(1.0*minHeap.peek()+maxHeap.peek())/2;
    }
}

public class Main {


    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add(0,"prat");
        list.add(0,"trunnaa");
        System.out.println(list);

    }

}
