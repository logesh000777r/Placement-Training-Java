package Collections.List;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shahana");
        list.add("Madhuja");
        list.add("Abi");
        list.add("Vaseem");
        list.add("Shahana");


        // //ArrayList Methods
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.get(2));
        // System.out.println(list.remove("Shahana"));
        // System.out.println(list);
        // System.out.println(list.set(3,"kishore"));
        // System.out.println(list.contains("Abi"));
        // System.out.println(list);

        
        // //  User input
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // sc.nextLine();
        // for (int i=1;i<=N;i++) {
        //     String item = sc.nextLine();
        //     list.add(item);
        // }
        
        // System.out.println("Displaying Items : \n"+list);

        //Iteration
        //Iterting using For loop
        // for (int i=0;i<list.size();i++) {
        //     System.out.println(list.get(i));
        // }


        //Iteration using For Each
        for (String str : list) {
            System.out.println(str);

        }

        // //Iterator
        // Iterator<String>it=list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        //..

        
    }

}
