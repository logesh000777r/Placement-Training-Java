// package DataStructuresAndAlgorithm.LinkedList;

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data=data;
//     }
// }

// public class InsertElement {

//     static void printList(Node head) {
//             Node temp = head;
//             while (temp!=null) {
               
                
//                 System.out.print(temp.data);
//                 if(temp.next!=null){
//                     System.out.print("->");
//                 }
//                 temp=temp.next;
                
//             }
//         }
//     public static void main(String[] args) {
//         Node head =new Node(10);
//         Node second=new Node(20);
//         Node third=new Node(30);
//         Node fourth=new Node(40);

//         head.next = second;
//         second.next = third;
//         third.next =fourth;

//         Node headNode= new Node(5);
//         headNode.next = head;
//         head=headNode;

//         Node tailNode=new Node(50);
//         Node temp = head;
//         while(temp.next!=null) {
//             temp = temp.next;
//         }
//         temp.next=tailNode;

       
//         Node positionNode=new Node(25);
//         temp=head;
//         while(temp.data !=20){
//             temp=temp.next;
//         }
//         positionNode.next=temp.next;
//         temp.next=positionNode;

//         printList(head);
        
        
//     }


// }
