package LeetcodeProblems;

import java.util.HashSet;

public class ContainsDuplicate217 {

    //My Answer beats 75.35%
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean istrue=false;
        for(int i=0;i<nums.length;i++){
            
            if(set.contains(nums[i])){
                istrue =true;
                break;
            }
            
            set.add(nums[i]);

        }
        return istrue;
        
    }

    //chatgpt
    // class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();

    //     for (int num : nums) {
    //         if (!set.add(num)) {
    //             return true;
    //         }
    //     }

    //     return false;
    //     }
    // }

}
