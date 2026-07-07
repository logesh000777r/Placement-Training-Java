package Exception_Handling;

public class Throw_Throws {
     static void checkAge(int age) throws Exception{
        if (age < 18) {
        throw new Exception("Not Eligible.");
        }

        System.out.println("Eligible!");
        
    }

    public static void main(String[] args)throws Exception {
        checkAge(20); 

}
}
