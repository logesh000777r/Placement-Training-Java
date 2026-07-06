package Oops;
abstract class Shape {
    abstract void area();

}
class Square extends Shape {
    void area() {
        int side = 5;
        System.out.println("Area :"+side*side);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Square ();  //object cannot be created for Abstract Class
        s.area();
    }

}
