package Collections.Map;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        String s= "java is easy java is powerfull";
        String words[] = s.split("");

        HashMap<String,Integer> map = new HashMap<>();
        for(String w: words) {
            if( map.containsKey(w)) {
                map.put(w,map.get(w)+1);
            }
            else{
                map.put(w, 1);
            }
        }
        System.out.println(map);
    }

}
