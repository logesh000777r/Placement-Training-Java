package Collections.Map;
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> Tm = new TreeMap<>();
        Tm.put(1,"A");
        Tm.put(2,"B");
        Tm.put(3,"C");
        Tm.put(5,"E");
        Tm.put(4,"D");
        System.out.println(Tm);
    }
}
