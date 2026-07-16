package DataStructuresAndAlgorithm.PrefixSum;

import java.util.*;
public class ChechTwoArr {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        int[] arr1={1,2,3,4};
        int[] arr2={5,4,3,8};
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            
            if(set.contains(arr2[i])){
                
                System.out.println(arr2[i]); //Print Duplicates
            }
            set.add(arr2[i]);
            
            
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(set);


    }

}
