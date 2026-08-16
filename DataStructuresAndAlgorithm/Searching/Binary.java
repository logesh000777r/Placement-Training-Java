package DataStructuresAndAlgorithm.Searching;


import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90};
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        int low = 0;
        int high =arr.length-1;
        boolean found = false;
        int i=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element Found at index : "+mid);
                found =true;
                break;
            }
            else if (arr[mid] < target) {
                
                low = mid+1;
            }else {
                high = mid-1;
            }
            i++;
        }
        if(!found){
            System.out.println("Element Not Found");
        }
        sc.close();
}
}
