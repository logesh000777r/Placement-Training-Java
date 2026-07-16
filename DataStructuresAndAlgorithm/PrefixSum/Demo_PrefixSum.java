package DataStructuresAndAlgorithm.PrefixSum;

public class Demo_PrefixSum {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10};
        int[] prefix =new int[arr.length];
        prefix[0]=arr[0];
        System.out.println("Given array are :");
        for(int num : arr){
            System.out.print(num +" ");
        }
        System.out.println();
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("Prefix Sum :");
        for(int num : prefix){
            System.out.print(num +" ");
        }
    }

}
