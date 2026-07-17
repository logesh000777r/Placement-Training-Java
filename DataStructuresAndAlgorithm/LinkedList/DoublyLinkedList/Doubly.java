package DataStructuresAndAlgorithm.LinkedList.DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;
}

public class Doubly {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.data= 100;
        second.data =200;
        third.data =300;

        first.prev=null;
        first.next=second;

        second.prev=first;
        second.next=third;

        third.prev=second;
        third.next=null;

        // System.out.println("Node 1");
        // System.out.println("Previous Address : "+first.prev);
        // System.out.println("Data : "+first.data);
        // System.out.println("Next Address : "+first.next);
        // System.out.println();

        // System.out.println("Node 2");
        // System.out.println("Previous Address : "+second.prev);
        // System.out.println("Data : "+second.data);
        // System.out.println("Next Address : "+second.next);
        // System.out.println();

        // System.out.println("Node 3");
        // System.out.println("Previous Address : "+third.prev);
        // System.out.println("Data : "+third.data);
        // System.out.println("Next Address : "+third.next);

        Node temp = first;
        while(temp != null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

}
