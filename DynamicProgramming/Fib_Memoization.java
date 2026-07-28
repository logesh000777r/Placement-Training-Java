import java.util.*;
public class Fib_Memoization {
    static int[] dp;
    static int fibonacci(int n ){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= fibonacci(n-1) + fibonacci(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibonacci(n));
    }

}
