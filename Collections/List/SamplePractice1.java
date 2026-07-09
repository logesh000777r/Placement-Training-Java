package Collections.List;
import java.util.*;

public class SamplePractice1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i=0;i<N;i++) {
            int item = sc.nextInt();
            list.add(item);
        }
        System.out.println("Reversing LinkedList :\n");
        for (int i=N-1;i>=0;i--) {
            System.out.print(list.get(i)+" ");
        }

    }

}
