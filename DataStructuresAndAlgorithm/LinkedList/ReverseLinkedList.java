package DataStructuresAndAlgorithm.LinkedList;
class Node{
    int data;
    Node next;
    Node prev;


    Node(int data){
        this.data = data;
    }
}

public class ReverseLinkedList {
    static void printList(Node head) {
            Node temp = head;
            while (temp!=null) {
               
                
                System.out.print(temp.data+" ");
                
                temp=temp.next;
                
            }
        }
        static void revList(Node fourth) {
            Node temp = fourth;
            while (temp!=null) {
               
                
                System.out.print(temp.data+" ");
                
                temp=temp.prev;
                
            }
        }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.prev=null;
        head.next=second;

        second.prev=head;
        second.next=third;

        third.prev=second;
        third.next=fourth;

        fourth.prev=third;
        fourth.next=null;
        

        printList(head);
        System.out.println();
        revList(fourth);
    }

}
