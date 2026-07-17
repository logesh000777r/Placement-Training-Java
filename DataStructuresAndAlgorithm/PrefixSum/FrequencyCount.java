package DataStructuresAndAlgorithm.PrefixSum;
import java.util.*;
public class FrequencyCount {
    public static void main(String[] args){
        int[] arr ={10,20,10,30,20,10};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println("Frequent Elements are :");
        for(Integer key: map.keySet()){
            System.out.println(key+"=>"+map.get(key));
        }
    }


}

//num      map.containsKey(num)      action               Hashmap
//10          false                  map.put()
//20          false
//10          true
//30          false
//20          true
//10          true