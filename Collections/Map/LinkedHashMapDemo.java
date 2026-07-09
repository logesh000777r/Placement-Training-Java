package Collections.Map;
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>();
        m.put(101,"Vasanthan");
        m.put(102,"Narayanan");
        m.put(103,"Shujith");//---->      --|
        m.put(104,"Loki");//                |
        m.put(105,"");//                    |------same key but but the value inserted finally will enetr the linkedHashMap
        m.put(null,"Narayanan");//           |
        m.put(103,"Narayanan");//---->    --|
        System.out.println(m);
    }

}
