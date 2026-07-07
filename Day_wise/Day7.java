package Day_wise;


//polymorphism
//|---------------------|-----------------|
//Method Overloading               Method Overriding
    //Polymorphism1.java(Method Overloading)
//*Abstraction */
//*Inteface */

//*Access Modifiers
//  class Access {

//     public int a = 10;
//     private int b= 20;
//     protected int c = 30;
//     int d = 40;

//     void display() {
//         System.out.println("Public = "+a);
//         System.out.println("Private = "+b);
//         System.out.println("protected = "+c);
//         System.out.println("Default = "+d);
//     }
// }
    
// public class Day7 { 
//     public static void main(String[] args) {
//         Access D = new Access();
//         System.out.println("Public :"+D.a);
//         // System.out.println("Private :"+D.b);
//         System.out.println("Protected :"+D.c);
//         System.out.println("Default :"+D.d);

//         D.display();

//     } 
    
// }

final class Keyword {
    final String str = "VET";
    final void display() {
        System.out.println("College Name : "+str);

    }
}
public class Day7{

    public static void main(String[] args) {
        Keyword K = new Keyword();
        K.display();
   
    }
}