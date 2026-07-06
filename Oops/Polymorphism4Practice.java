package Oops;

class Drawing {
    void draw() {
        System.out.println("Drawing shape");
    }

}


class Drawing1 extends Drawing {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

}


public class Polymorphism4Practice {
    public static void main(String[] args) {
        
        
        Drawing1 D1 = new Drawing1();
        D1.draw();
        Drawing D = new Drawing();
        D.draw();
    }

}
