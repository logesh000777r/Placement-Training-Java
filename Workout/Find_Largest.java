package Workout;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Largest {
    public static void main(String[] args) {
        int[] arr = {2,7,8,9,23,78};
        int k=3;
        PriorityQueue pq = new PriorityQueue<>();
        for(int x : arr){
            pq.add(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());



        
        
       

    }

}
