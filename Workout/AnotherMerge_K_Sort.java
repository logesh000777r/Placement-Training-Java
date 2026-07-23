package DataStructuresAndAlgorithm.Sorting;

import DataStructuresAndAlgorithm.Queue.PriorityQueue;
import java.util.PriorityQueue;

public class AnotherMerge_K_Sort {
    public static void main(String[] args) {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr1 ={1,4,7};
        int[] arr2 ={2,5,8};
        int[] arr3 ={3,6,9};
        for(int x : arr1){
            pq.add(x);
        }
        for(int x : arr2){
            pq.add(x);
        }
        for(int x : arr3){
            pq.add(x);
        }
        while(!pq.isEmpty()){
            pq.poll();
        }
        
    }

}
