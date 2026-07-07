package Day_wise;
// import java.util.Arrays;
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {

        //* 1D Array */
        
        int a[] ={10,20,30,50,40};

        //*Accessing Index */

        // System.out.println(a[3]);
          
        // for (int i=0;i<a.length;i++) {
        //     System.out.println("Index "+ i +" = " +a[i]);
        // }

        //*Sum of Array */

    //    int sum = 0;
    
    //     for (int i=0;i<a.length;i++) {
    //         sum+=a[i];   //sum=sum+ a[i];
    //     }

    //     System.out.println("Sum = "+ sum);

        //*Average of array */

        // for (int i=0;i<a.length;i++) {
        //     sum+=a[i];   //sum=sum+ a[i];
        // }

        // System.out.println("Sum = "+ sum);

        // //int n = a.length;

        // //int avg = sum/n;

        // System.out.println("Average = "+sum/a.length);

        //*Largest of Array */

        // int largest = a[0];

        // for (int i=0;i<a.length;i++) {
        //     if (a[i]>largest){
        //         largest=a[i];
        //     }
        // }
        // System.out.println("Largest = "+largest);

        //*Lowest Of Array */

        // int lowest = a[0];

        // for (int i=0;i<a.length;i++) {
        //     if (a[i]<lowest){
        //         lowest=a[i];
        //     }
        // }
        // System.out.println("Largest = "+lowest);

        


        for (int i=a.length-1;i>=0;i--) {
            System.out.print(a[i]);

            
        }

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        
        
        // for(int i=0; i<a.length;i++) {
        //     System.out.print(a[i] + " ");

        // }
        // for (int i:a)
        //     System.out.println(i);
      
        
        //*Difference of arrray */
        
    //    int diff = a[0];
    
    //     for (int i=1;i<a.length;i++) {
    //         diff-=a[i];   
    //     }

    //     System.out.println("Difference = "+ diff);

    //String Array

        // String[] fruits = {"Apple","Mango","Banana","Orange"};
        // for (String fruit : fruits)
        // System.out.print(fruit+" ");

        //Long Array

        // long[] ls = {1234L,2345L,3456L,5678L};
        // for (long l : ls)
        // System.out.println(l);

        //Float Array

        // float[] ss = {12.34f,23.45f,34.56f,56.78f};
        // for (float s : ss)
        // System.out.println(s);

        //char Array

        // char[] cs = {'A','B','C'};
        // for (char c : cs)
        // System.out.println(c);

        //*Entering Array Elements */

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array Size :");
        // int n=sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the Elements :");
        // for (int i=0;i<n;i++) {
        //     arr[i]=sc.nextInt();
        // }
        // for (int j=0;j<n;j++){
        //     System.out.print(arr[j]+" ");
        // }

        //*Sort The array */
        //eg : [30,25,10,50] ---> [10,25,30,50]

        // int[] arr = {30,25,10,50};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        //MaX No

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

       

        
        
    }
    
}
