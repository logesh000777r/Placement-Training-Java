package HomeWork;
import java.util.*;
public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        int even =0;
        int odd =0;
        for (int i =0;i<n ;i++){
            if(a[i]%2==0)

            even++;
            else
            odd++;

        }
        System.out.println("even count:"+even);
        System.out.println("odd count:"+odd);










        // int arr[] = {1,2,3,4,5,6};
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         // System.out.print(arr[i]+" ");
        //         count1++;
        //     }
        //     else{
        //         // System.out.print(arr[i]+" ");
        //         count2++;
        //     }
        // }
        // System.out.println("Even count = "+count1);
        // System.out.println("Odd count = "+count2);
    }

}
