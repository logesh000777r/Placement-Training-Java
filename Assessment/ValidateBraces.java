package Assessment;

import java.util.Scanner;

    public class ValidateBraces {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
    
        
        for(int i=0;i<str.length()-1;i++){
        char ch = str.charAt(i);
        char ch1=str.charAt(i+1);
        if(((ch=='(')&&(ch1==')'))|| ((ch=='{')&&(ch1=='}'))
        ||((ch=='[')&&(ch1==']'))){
            System.out.println("true");
            
        }else{
            System.out.println("false");
        }
        
    }
    }

}
