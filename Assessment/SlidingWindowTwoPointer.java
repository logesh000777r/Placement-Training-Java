package Assessment;

import java.util.Scanner;

public class SlidingWindowTwoPointer {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
    }
    int target = sc.nextInt();
    int left =0;
    // int right = 0;
    int windowSum =0;
    // int x=0;
    for(int right=0;right<n;right++){
      windowSum=arr[left]+arr[right];
      if(windowSum==target){
        left++;
        right--;
        windowSum=0;
      
      }
      else if(windowSum<target){
        left++;
        windowSum=0;
      }else{
        right--;
      }
      
    }
    int min = windowSum;
    // for(int i=x;i<n;i++){
    //   windowSum=windowSum - arr[i-x];
    //   windowSum=windowSum + arr[i];
    //   if(windowSum<min){
    //     min = windowSum;      }
    // }
    System.out.println(min);
  }
    
}
