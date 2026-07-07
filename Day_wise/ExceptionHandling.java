package Day_wise;
//*Exception Handling */
public class ExceptionHandling {

    //*try-catch */
    // public static void main(String[ ] args) {
    //     try {
    //     int[] myNumbers = {1, 2, 3};
    //     System.out.println(myNumbers[10]);
    //     } catch (Exception e) {
    //     System.out.println("Something went wrong.");
        
    //     }
    // }

    //*finally */
//     public static void main(String[] args) {
//     try {
//       int[] myNumbers = {1, 2, 3};
//       System.out.println(myNumbers[10]);
//     } catch (Exception e) {
//       System.out.println("Something went wrong.");
//     } finally {
//       System.out.println("The 'try catch' is finished.");
//     }
//   }

//* Multiple Catch */

    // public static void main(String[] args) {
        // int arr[] = {1,2,3};
        // try{
        //     System.out.println(arr[10]);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Accessing out of Range Element");
        // }
        // String s = null;
        // try{
        //     System.out.println("Length of String s :"+s.length());
        // }
        // catch(NullPointerException e){
        //     System.out.println("Accessing Null String");
        // }
        // int a=10;
        // int b=0;
        // try {
        //     System.out.println("Division :"+a/b);
        // } catch (ArithmeticException e) {
        //     System.out.println("Division by zero");
        // }
        
//         try{
//             int arr[] = {1,2,3};
//             String s = null;
//             int a=10;
//             int b=0;
//             System.out.println(arr[10]);
//             System.out.println("Length of String s :"+s.length());
//             System.out.println("Division :"+a/b);
//     }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Accessing out of Range Element");
//         }
//         catch(NullPointerException e){
//             System.out.println("Accessing Null String");
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Division by zero");
//         }

//     }

//   public static void main(String[] args) {
//     try {
//       int[] numbers = {1, 2, 3};
//       System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
//       int result = 10 / 0;              // ArithmeticException
//     } 
//     catch (ArrayIndexOutOfBoundsException e) {
//       System.out.println("Array index does not exist.");
//     } 
//     catch (ArithmeticException e) {
//       System.out.println("Cannot divide by zero.");
//     } 
//     catch (Exception e) {
//       System.out.println("Something else went wrong.");
//     }
//   }
// }


//*Trial and error */

    // public static void main(String[] args) {
    //     int a =0;
    //     String s = "loki";
    //     try {
            
    //         try {

    //             if (s.equals("loki"))
    //             for(int i =1;i<=a;i++) {
    //                 System.out.println(s);
    //             }


                
    //         }
                
    //         catch (Exception e) {
    //                     System.out.println("Empty String");
    //         }
            
    //         if (a>0)
    //         System.out.println(10/a);
         
    //     }
    //     catch (Exception e) {
    //                 System.out.println("a is zero"); 
    //             }
    
    // static void checkAge(int age) throws Exception{
    //     if (age < 18) {
    //     throw new Exception("Not Eligible.");
    //     }

    //     System.out.println("Eligible!");
        
    // }

    // public static void main(String[] args)throws Exception {
    //     checkAge(20); 
}
}