package DataStructuresAndAlgorithm.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Heap {
    public static void main(String[] args) {
        int [] arr = {10,5,20,2,8};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections .reverseOrder());
        

        for(int x :arr){
            pq.add(x);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }

}
}
