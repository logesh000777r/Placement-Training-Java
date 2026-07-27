package DataStructuresAndAlgorithm.TwoPointers.OppositeDirection;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left=0;
        int right=str.length()-1; 
        for(int i=0;i<(str.length()/2)+1;i++){
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if(ch1==ch2){
                left++;
                right--;
                if(left==right ){
                    System.out.println("Palindrome");

                }
            }else{
                System.out.println("Not a Palindrome");
                break;
            }


        }
    }

}
