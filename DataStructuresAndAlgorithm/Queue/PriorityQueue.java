package DataStructuresAndAlgorithm.Queue;
import java.util.PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
       
       PriorityQueue<Integer>p = new PriorityQueue<>();
       p.add(30);
       p.add(20);
       p.add(10);

       while(!p.isEmpty()){
            System.out.println(p.poll());
            System.out.println(p);

       }
        
    }


}
