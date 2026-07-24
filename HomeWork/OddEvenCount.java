package HomeWork;

public class OddEvenCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                // System.out.print(arr[i]+" ");
                count1++;
            }
            else{
                // System.out.print(arr[i]+" ");
                count2++;
            }
        }
        System.out.println("Even count = "+count1);
        System.out.println("Odd count = "+count2);
    }

}
