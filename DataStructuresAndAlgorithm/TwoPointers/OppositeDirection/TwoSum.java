package DataStructuresAndAlgorithm.TwoPointers.OppositeDirection;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target = 3;
        int left = 0;
        int right =arr.length-1;
        int sum =0;
        while(left<=right){
            sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Target "+target+" reached"+" at index "+left+" "+right);            
                left++;
                right--;
                sum=0;
            }else if(sum<target){
                left++;
                sum=0;
            }else{
                right--;
                
            }
        }
        if(sum==1 )
        System.out.println("pair not found");

    }

}
