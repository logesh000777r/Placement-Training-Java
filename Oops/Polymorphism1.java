package Oops;

// Method Overloading
class Calculator {
    int add(int a,int b) {
        return a+b;
    }

    int add(int a,int b,int c) {
        return a+b+c;
    }
}


public class Polymorphism1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 Digits = "+c.add(10,20));
        System.out.println("Sum of 3 Digits = "+c.add(10,20,30));
    }

}
