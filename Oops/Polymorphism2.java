package Oops;

class Animal {
    void sound(){
        System.out.println("Animal Sounds");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat Sounds Meow");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal A = new Animal();
        Cat C = new Cat();
        A.sound();
        C.sound();
    }

}
