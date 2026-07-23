package Workout;

import java.util.HashMap;
import java.util.PriorityQueue;



public class Top_K_Frequency {
    public static void main(String[] args) {
        
    
        
        int arr[] ={1,1,1,2,2,3,4,3,4,4,4};
        int k=4;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int x : arr){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int x : m.keySet()){
            p.add(x);
            if(p.size()>k){
                p.poll();
            }
        }
        while(!p.isEmpty()){
            int count = p.poll();
            System.out.println(count+" = "+m.get(count));
        }
       
        

}
}
