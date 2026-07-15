package DataStructuresAndAlgorithm.Searching;

import java.util.Scanner;

public class BinaryUsingRecursive {
    static int binarySearch(int[] arr,int low,int high,int target){

        if(low>high) {
            return -1;
        }
        int mid=low+(high-low)/2;
        if (arr[mid]==target){
            return mid;
        }if (arr[mid]<target){
            return binarySearch(arr,mid+1,high,target);
        }
        return binarySearch(arr,low,mid-1,target);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80};
        System.out.println("Enter target :");
        int target = sc.nextInt();
        int index=binarySearch(arr,0,arr.length-1,target);
        if (index==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element Found at index :"+index);
        sc.close();
    }

}

