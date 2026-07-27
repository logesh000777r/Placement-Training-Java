package DataStructuresAndAlgorithm.TwoPointers.OppositeDirection;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target = 3;
        int left = 0;
        int right =arr.length-1;
        int sum =0;
        boolean found = false;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Target "+target+" reached"+" at index "+left+" "+right+" and Value of "+arr[left]+" "+arr[right]);   
                found=true;         
                left++;
                right--;
                
            }else if(sum<target){
                left++;
                // sum=0;
            }else{
                right--;
                
            }
        }
        if(!found)
        System.out.println("pair not found");

    }

}
