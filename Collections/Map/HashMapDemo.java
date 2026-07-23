package Collections.Map;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Name");
        map.put(2,"Vasanthan");
        map.put(3,"");
        map.put(4,"Vasanthan");
        // System.out.println(map);

        //*Common Methods */
        // map.remove(3);
        // System.out.println(map);
        // System.out.println(map.get(4));
        // System.out.println(map.hashCode());
        // System.out.println(map.toString());
        // System.out.println(map.isEmpty());
        // System.out.println(map.size());  
        // System.out.println(map.containsValue("Vasanthan"));
        // System.out.println(map.values());
        System.out.println(map.keySet());
        // System.out.println(map.containsKey(4));
        // System.out.println(map.entrySet());

        //*For Iteration */
        // for(HashMap.Entry<Integer, String> e:map.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

    }

}
