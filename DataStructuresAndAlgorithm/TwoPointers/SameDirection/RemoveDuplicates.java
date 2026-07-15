package DataStructuresAndAlgorithm.TwoPointers.SameDirection;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,5,6};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Unique element:");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }

}
