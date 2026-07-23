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

    public void add(int x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    public void poll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'poll'");
    }


}
