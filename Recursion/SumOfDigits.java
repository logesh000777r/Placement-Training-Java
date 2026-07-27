package Recursion;

public class SumOfDigits {
    static int sumOfDig(int num){
        if(num==0){
            return 0;

        }
        return (num%10)+sumOfDig(num/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDig(n));
    }

}
