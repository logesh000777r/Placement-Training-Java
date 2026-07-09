package Collections.List;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Apple");
        list.addLast("Orange");
        list.addFirst("Banana");
        list.addLast("Grapes");
        list.addFirst("Mango");
        System.out.println("Fruits List :"+list);
        list.removeFirst();
        System.out.println("Removed First Fruit  from List :"+list);
        list.removeLast();
        System.out.println("Removed Last Fruit  from List :"+list);
        list.getFirst();
        System.out.println("Fruits List :"+list);
        list.getLast();
        System.out.println("Fruits List :"+list);
        
    }

}
