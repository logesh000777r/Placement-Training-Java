package Oops;

class Area {
    
    int area (int a){
        return a*a;
    }
    int area (int b,int c){
        return b*c;
    }

    float area (float r){
        return r*r*3.14f;
    
    }
    
}

public class Polymorphism3Practice {
    public static void main(String[] args) {
        Area A = new Area();
        System.out.println("Area of Square :"+A.area(4) +"sq.cm");
        System.out.println("Area of Rectangle :"+A.area(4,5)+"sq.cm");
        System.out.println("Area of Circle :"+A.area(4.5f)+"sq.cm");
    }

}
