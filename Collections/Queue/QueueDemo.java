package Collections.Queue;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Add Elements :"+q);
        System.out.println("Offer :"+q.offer(20)+"\n"+q);
        System.out.println("Peek Element :"+q.peek());
        System.out.println("Element :"+q.element());
        System.out.println("Remove :"+q.remove());
        System.out.println("Poll :"+q.poll());
        System.out.println(q.iterator());
        System.out.println("Size :"+q.size());
        System.out.println("Clear :");
        q.clear();
        System.err.println(q);
        System.out.println("is Empty :"+q.isEmpty());

    }

}
