package DataStructuresAndAlgorithm.SlidingWindow;

public class FixedSlidingWin_Demo {
    public static void main(String[] args) {
        int[] arr ={2,1,5,1,3,2};
        int k=3;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum +=arr[i];
        }
        int max=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum =windowSum - arr[i-k];
            windowSum =windowSum + arr[i];
            if(windowSum>max){
                max=windowSum;
            }
        }
        System.out.println("Maximum Sum "+max);
    }

}
