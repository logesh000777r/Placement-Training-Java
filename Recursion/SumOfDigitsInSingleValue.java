package Recursion;

public class SumOfDigitsInSingleValue {
    static int sumOfDig(int num){
        if(num==0){
            return 0;

        } 
        return (num%10)+sumOfDig(num/10);
    }
    static int singleSum(int num){
        if(num<10){
            return 0;
        }
        return (sumOfDig(num)/10)+(sumOfDig(num)%10);

    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Given Number : "+n);
        System.out.println(sumOfDig(n));
        System.out.println(singleSum(n));
    }

}
