package Oops;



class Bank1 {

    String name;
    int pin;
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }

    public void setPin(int i){
        pin = i;
    }
    public int getPin(){
        return pin;
    }
}
public class Bank{
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setName("Narayanan");
        System.out.println("Name :"+b.getName());
        b.setPin(890);
        System.out.println("Pin No :"+b.getPin());


        
    }

}
