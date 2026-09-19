//problem no.215
//beats 94.30 %

import java.util.Arrays;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-k];
        
    }

}

//but should try by sorting manually
//then without sorting
