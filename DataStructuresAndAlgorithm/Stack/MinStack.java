package DataStructuresAndAlgorithm.Stack;
import java.util.*;

public class MinStack {
    static Stack<Integer>stack = new Stack<>();
    static Stack<Integer>minStack = new Stack<>();
    static void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }
    static void pop() {
        int value =stack.pop();
        if (value==minStack.peek()){
            minStack.pop();
        }

    }
    static void getMin(){
        
    }
    public static void main(String[] args) {
        push(5);
        push(3);
        push(7);
        push(2);
        System.out.println("Minimum : "+getMin());
        pop();
        System.out.println("Minimum : "+getMin());
    }

}

