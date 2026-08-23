package DataStructuresAndAlgorithm.Sorting;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2};

        // //*Method 1 */
        // for (int i= 1; i<arr.length; i++) {[]
        //     for(int j=0;j<i;j++){
        //         int temp = arr[i];
        //         if (arr[i]>arr[j]){
        //             arr[i]=arr[i];
        //         }
        //         else{
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }

            
        // }
        // System.out.println("Sorted Array:");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //*Method 2 */
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){    //(also)for(int j=0;j<arr.length-1;j++)(possible)
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
         System.out.println("Sorted Array:");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int num : arr){
            System.out.println(num+" ");
        }


    }

}
