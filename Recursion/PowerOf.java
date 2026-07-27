package Recursion;

public class PowerOf {
    static int powOf(int n,int pow){
        if (pow==0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        return n*powOf(n,pow-1);
    }
    public static void main(String[] args) {
        int base = 2;
        int power = 4;
        System.out.println(powOf(base,power));
    }

}
// power(2,4)
// 2 x power(2,3)
// 2 x 2 x power(2,2)
// 2 x 2 x 2 x power(2,1)
// 2 x 2 x 2 x 2 x power(2,0)=>(1)
//                        
// 2 x 2 x 2 x 2 x 1 =16
// 
// 
// 
// 
// 
// 
// 
// 
// 

