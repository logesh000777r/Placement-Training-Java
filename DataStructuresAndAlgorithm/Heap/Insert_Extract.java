package DataStructuresAndAlgorithm.Heap;

import java.util.PriorityQueue;

public class Insert_Extract {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }

}
