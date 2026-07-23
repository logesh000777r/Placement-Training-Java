package Workout;


public class Sample { 
    public static void main(String[] args) {

        // //pow
        // int [] arr ={1,2,3,4,5};
        // for(int i=0;i<5;i++){
        //     int j =(int)Math.pow(arr[i],arr[i+1]);
        //     System.out.println(j+" ");
        // }


        int [] arr ={1,2,3,4,5};
        int mid = arr.length/2;
        int arr1[] =new int[arr.length];
        int j=0;        
        for (int i = mid; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(i==arr.length-1){
                for( j=0;j<mid;j++){
                    System.out.print(arr[j]+" ");
                    
                }
            }
            arr1[i]+=arr[j];
        }
        // 4 1 5 2 3
        System.out.println();
        for(int x : arr1){
            System.out.print(arr1[x]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr1[i]%2==1){
                System.out.print(arr1[i]+" ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr1[i]%2==0){
                System.out.print(arr1[i]+" ");
            }
        }
        System.out.print(arr1[0]);
        
        // String str = " Hello World";
        // StringBuilder s = new StringBuilder(str);
        // s=s.reverse();
        // System.out.println(s);

    }
    
}