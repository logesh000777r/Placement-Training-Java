package Recursion;

public class SumOfSeries {
    static int SoD(int i){
        if(i==0){
            return 0;
        }
        
        return i+(SoD(i-1));
    }
    public static void main(String[] args) {
        int n=10;
        int value=0;
        for(int i=0;i<n;i++){
            value = SoD(n);
        }
        System.out.println(value);
    }

}
