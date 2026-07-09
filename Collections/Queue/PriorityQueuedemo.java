package Collections.Queue;
import java.util.*;
public class PriorityQueuedemo {
    public static void main(String[] args) {
        
       // PriorityQueue<Integer> p = new PriorityQueue<>();
        // p.add(20);
        // p.add(50);
        // p.add(10);
        // p.add(90);
        // p.add(70);
        // p.add(10);
        // System.out.println(p);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(10);
        minHeap.add(40);
        minHeap.add(30);
        minHeap.add(66);
        System.out.println(minHeap);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
            System.out.println(minHeap);

        }
    }

}
