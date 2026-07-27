package HomeWork;
import java.util.*;
public class CharFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left=0;
        int right=0;
        int count =0;
        while(left!=str.length()-1){
            count=0;
            for(int i=right;i<str.length();i++){
                char ch1 = str.charAt(right);
                char ch2 = str.charAt(left);
                if(ch1==ch2){
                    count++;
                    
                }
                // right++;
            }
            System.out.println(str.charAt(left) +" Appears "+count+" times..");
            
            left++;
            
            

        }
        
    }


}
