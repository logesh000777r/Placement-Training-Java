import java.util.Scanner;
public class Day3_FN {
    public static void main(String[] args){
        // for (int i=10;i>=1;i--){
        //     System.out.println(i);
        // }
    //     for (int i=0;i<=20;i=i+2){
    //         System.out.println(i);
    //     }
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number to generate Multiplication Table :");
    // int n =sc.nextInt();
    // for (int i=1;i<=1000;i++) {
    //     System.out.println(i+"x"+n+"="+(n*i));
    // }
    // int i=1;
    // while(i<=5) {
    //     System.out.println(i);
    //     i++;

    // }
    System.out.println("Enter a number:");
    
    int num = sc.nextInt();

    
    int sum = 0;



    while (num > 0) {
        
        sum+=num%10;
        num=num/10;
        
     } 
    System.out.println("sum of digits :"+sum);
    // int digit_1 = num/10;
    // int digit_2 = num%10;

    // int sum = 0;
    // sum = digit_1+digit_2;
    // System.out.println(sum);

    sc.close();
     }
}

