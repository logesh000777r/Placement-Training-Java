package DataStructuresAndAlgorithm.Searching;
import java.util.Scanner;


public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,45,12,67,28,90,41,60};
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        boolean found = false;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                System.out.println("Element "+target+" Found at index :"+i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Element not found in given array");
            
        }  
        sc.close(); 
    }


}
