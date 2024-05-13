package DesignPatterns.AbstractFactory;


import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        PizzaStore pz = new NYStylePizzaStore();
        pz.orderPizza("cheese");


        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] array = list.toArray();
        for (Object o : array) {
            if(o instanceof Integer) {
                int a = (int) o;
                System.out.println(a*3);
            }
        }
        list.remove(Integer.valueOf(2));
        //Collections.swap(list,0,2); // static utility methods
        list.sort((a,b) -> b-a);
        ListIterator<Integer> litr = list.listIterator(); // has additional methods
        //CopyOnWriteArrayList also same for LinkedList
        //Vector similar to arraylist but thread safe and because of that slow
        //Stack extends Vector, so it is also thread safe
        Stack<Integer> stack = new Stack<>();

        ArrayDeque<Integer> q = new ArrayDeque<>(); // ConcurrentLinkedDeque


        Queue<Integer> q1 = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min pq PriorityBlockingQueue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b) -> b-a); // max pq

        Integer[] arr = {1,2,3,4,5};
        Arrays.sort(arr, (Integer a,Integer b) -> b-a);

        // Comparator -> compare
        // Comparable -> compareTo

        HashMap<Integer, Integer> map = new HashMap<>(); // We can have null key
        map.putIfAbsent(1,1);
        map.putIfAbsent(2,1);
        map.putIfAbsent(3,1);

        int a = map.putIfAbsent(1,2);
        System.out.println(a);

        Map<Integer, String> lmap =new LinkedHashMap<>(16,.75F,true);
        lmap.put(1,"prat");
        Set<Map.Entry<Integer, String>> lms = lmap.entrySet();
        for(Map.Entry<Integer, String> x : lmap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }


        Map<String,String> mp = Collections.synchronizedMap(new LinkedHashMap<>());
        Map<Integer, String> tmap =new TreeMap<>();
//        tmap.put(null,"0");

        HashSet<Integer> tset = new HashSet<>();
        tset.add(null);
        for(Integer x:tset) System.out.println(x);

        //TreeMap -> Red-Black tree, map->sortedMap->navigableMap->TreeMap






    }
}
