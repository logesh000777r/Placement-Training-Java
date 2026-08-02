//09 Leetcode - Palindromic Number
import java.util.Scanner;
public class PalindromicNumber {

    //My Answer
    public boolean isPalindrome(int x) {
        long rev=0;
        int a = x;
        int n;
        while(x!=0){
            n=x%10;
            rev=rev*10+n;
            x=x/10;
        }
        if((rev==a && a>0)|| a==0){
            return true;
        }
        return false;
      
    }


    //Chatgpt Method 1 

    // public boolean isPalindrome(int x) {
    //     // Negative numbers are not palindromes
    //     if (x < 0) {
    //         return false;
    //     }

    //     int original = x;
    //     int reverse = 0;

    //     while (x != 0) {
    //         int digit = x % 10;
    //         reverse = reverse * 10 + digit;
    //         x = x / 10;
    //     }

    //     return original == reverse;
    // }

//     //Better Method
// public boolean isPalindrome(int x) {
//         if (x < 0 || (x % 10 == 0 && x != 0)) {
//             return false;
//         }

//         int reversedHalf = 0;

//         while (x > reversedHalf) {
//             reversedHalf = reversedHalf * 10 + x % 10;
//             x /= 10;
//         }

//         return x == reversedHalf || x == reversedHalf / 10;
//     }

    public static void main(String[] args) {
        PalindromicNumber p = new PalindromicNumber();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(p.isPalindrome(x));
        
    }

}
