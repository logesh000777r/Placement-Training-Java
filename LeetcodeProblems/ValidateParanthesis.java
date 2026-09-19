import java.util.Stack;
//problem no.20
//beats 86.08 %
public class ValidateParanthesis {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        boolean isVal = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{              
                if(stack.isEmpty()){
                    isVal =false;
                    break;
                }
                char top = stack.pop();                
                if((ch==')' && top=='(')||(ch==']' && top=='[')
                ||(ch=='}' && top=='{')){
                    isVal = true;                    
                }
                else{
                    isVal = false;
                    break;
                }
            }
            if(!stack.isEmpty()) {
            isVal = false;
            }
        }
    return isVal; 
    }

}
