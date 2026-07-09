package Collections.other;
import java.util.*;


class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age,String name){
        this.age = age;
        this.name = name;

    }
    public int compareTo(Student)
}

public class ComparableDemo {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22,"Ram"));
        list.add(new Student(20,"John"));
        list.add(new Student(21,"Sam"));
        Collections.sort(list);
        System.out.println(list);

    }
    

}
