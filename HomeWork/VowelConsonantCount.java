package HomeWork;
import java.util.*;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a String : ");
       
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for ( int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch=='A' || ch =='E'|| ch== 'I'|| ch== 'O'|| ch=='U'||ch=='a' || ch =='e'|| ch== 'i'|| ch== 'o'|| ch=='u'){
                vowels++;

            }else{
                consonants++;
            }
        
            
        }
        System.out.println("Vowels count :"+vowels);
        System.out.println("Consonants count :"+consonants);
    }

}

