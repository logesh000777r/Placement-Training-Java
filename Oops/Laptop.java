package Oops;

public class Laptop {
    String Brand;
    String color;
    int price;

    void display () {
        System.out.println("Brand :"+Brand);
        System.out.println("Color :"+color);
        System.out.println("Price :"+price);
    } 

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.Brand = "HP";
        l1.color = "Black";
        l1.price  =70000;

        Laptop l2 = new Laptop();
        l2.Brand = "Dell";
        l2.color = "Black";
        l2.price  =60000;

        l2.display();
        l1.display();

    }
}
