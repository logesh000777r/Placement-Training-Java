package DataStructuresAndAlgorithm.Sorting;


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2};
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j] < arr[min]){
                // arr[min]=arr[j+1];
                // arr[j]=arr[j+1];
                min =j;
               }
               
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Sorted Array :");
        for(int num : arr){
            System.out.println(num+" ");
        }

    }

}
