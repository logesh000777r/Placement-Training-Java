package DataStructuresAndAlgorithm.Searching;


public class FirstOfOccurence {
    public static int FirstOccurence(int[] arr,int target){
        int low=0;
        int high = arr.length-1;
        int ans=-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;


            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println("First Occurrence : "+FirstOccurence(arr,3));
    }}


