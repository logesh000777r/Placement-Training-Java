package Collections.List;
import java.util.*;
public class New {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=N;i++) {
            String item = sc.nextLine();
            list.add(item);
        }
        System.out.println("Displaying List :\n");
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }    
        System.out.println("Reversing List :");
        for (int i=list.size()-1;i>=0;i--) {
            System.out.println(list.get(i)); 
        }
        System.out.println("Catching null value if any :");
        for (String str : list) {
            if (str==null){
                System.out.println("null string");

            }
            
        
                System.out.println("No null value");
    }

}
