package DataStructuresAndAlgorithm.Sorting;

import java.util.Arrays;

public class Merge_k_Sorted_Array {
    static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }
    static void merge(int[] arr,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(i=left,k=0;i<=right;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr1[] = {1,4,7};
        int arr2[] = {2,5,8};
        int arr3[] = {3,6,9};
        int result[] = new int[9];
        mergeSort(arr1,0,arr1.length-1);
        mergeSort(arr2,0,arr2.length-1);
        mergeSort(arr3,0,arr3.length-1);
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));
        for (int i=0;i<=2;i++){
            result[i]=arr1[i];
        }
        for(int i=3;i<=5;i++){
            
            result[i]=arr2[i-3];
           
        }
        for(int i=6;i<=8;i++){
            
            result[i]=arr3[i-6];
            
        }
        
        // mergeSort(result,0,result.length-1);
        // System.out.println(Arrays.toString(result));
        mergeSort(result,0,result.length-1);
        System.out.println(Arrays.toString(result));
        
    }

}
