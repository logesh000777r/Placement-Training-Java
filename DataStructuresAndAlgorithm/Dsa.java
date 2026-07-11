package DataStructuresAndAlgorithm;
public class Dsa {
    public static void main(String[] args){

        //*time Complexity */
        // int a[] = {1,2,3,4,5};
        // System.out.println(a[1]);

        //Linear Search
        // int target = 5;
        // for (int i=0;i<5;i++) {
        //     if (a[i]==target) {
        //         System.out.println("Target Reached :"+target);
        //         break;
        //     }
        // }
        // int n=60;
        // while (n!=1) {
        //     n=n/2;
        //     System.out.println(n);
        // }
        // System.out.println("Final n value :"+n);

        // int count =0;
        // for (int i =60;i>=1;i=i/2){
        //     System.out.println(i);
        //     count++;
        // }
        // System.out.println(count);

        int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        
        int sum2=0;
        int b[] =new int[4];
        int largest =b[0];
        for (int i=0;i<4;i++) { 
            sum2=0;
            for (int j=0;j<3;j++) {
                sum2+=a[i][j];
            }
            System.out.print(sum2+" ");
            b[i]=sum2;
            for (int k=0;k<4;k++){
                if (b[k]>=largest){
                    largest=b[k];
                }
            }
        }       
        System.out.println("\n"+largest);
    }

}