package DataStructuresAndAlgorithm.PrefixSum;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] arr ={2,7,11,15};
        int target =9;
        for (int i =0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("Index :"+map.get(complement)+" "+i);
            }
            map.put(arr[i],i);
        }

    }

}

//Explanation
//Iteration    i    arr[i]    comp(target =9)      Hashmap
//1            0      2        7 (9-2)               {2,0}
//2            1      7        2                     {2,0}{7,1}