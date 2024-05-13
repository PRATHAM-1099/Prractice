package DSA;

import DSA.Trie.TrieOperations;

import java.util.*;


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

        TrieOperations trieOperations = new TrieOperations();
        trieOperations.insert("apple");
        trieOperations.insert("apple");
        trieOperations.insert("apple");
        trieOperations.insert("apps");
        trieOperations.insert("bat");
        trieOperations.insert("cat");
        trieOperations.insert("d");
        trieOperations.insert("a");

        System.out.println(trieOperations.searchWord("apps"));
        System.out.println(trieOperations.searchPrefix("d"));
        System.out.println(trieOperations.startsWith("a"));

//        List<String> list = new ArrayList<>();
//        list.add("g");
//        list.add("a");
//        list.add("ak");
//        list.add("szhkb");
//        list.add("hy");
//        list.add("ninga");
//
//        trieOperations.insert("g");
//        trieOperations.insert("a");
//        trieOperations.insert("ak");
//        trieOperations.insert("szhkb");
//        trieOperations.insert("hy");
//        trieOperations.insert("ninga");
//
//        System.out.println(trieOperations.startsWith("a"));
//
//        System.out.println(trieOperations.completeString(list));

    }

}
