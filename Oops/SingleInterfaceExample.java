package Oops;

interface Drawable{
    void display();

}
class Draw implements Drawable{
    @Override
    public void display() {
        System.out.println("Draw Circle");
    }
}

public class SingleInterfaceExample {
    public static void main(String[] args) {
        Draw D = new Draw();
        D.display();

    }
}
