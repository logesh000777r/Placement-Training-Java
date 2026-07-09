package Collections.List;
import java.util.*;

public class SamplePractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i=0;i<N;i++) {
            int item = sc.nextInt();
            list.add(item);
        }
        
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        
    }

}
