package DataStructuresAndAlgorithm;

public class LargestFrequency {
    public static void main(String[] args) {
        int a[] = {1,1,0,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1};
        int count=1;
        int largest =1;
        for (int i=0;i<a.length-1;i++){
            if((a[i]==a[i+1])&& (a[i]==1)){
                count++;
            }
            else{
                count=1;
            }
            if(count>largest){
                largest=count;
            }

        }
        System.out.println(largest);
    }

}
