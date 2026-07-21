package DataStructuresAndAlgorithm.Queue;
import java.util.*;

public class Queue_arr {
    static int[] queue=new int[5];

    static int front =0;
    static int rear=-1;

    static void enqueue(int value) {
        if(rear==queue.length-1) {
            System.out.println("Queue is Full");
        }
        queue[++rear]=value;
    }
    static void dequeue(){
        if (front>rear){
            System.out.println("Queue is Empty");
        }
        System.out.println("Removed : "+queue[front++]);
    }
    static void peek(){
        if (front>rear){
            System.out.println("Queue is Empty");
        }
        System.out.println("Front :"+queue[front]);
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        peek();
        dequeue();
        peek();
    }

}
