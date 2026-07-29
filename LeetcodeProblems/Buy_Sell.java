package LeetcodeProblems;

public class Buy_Sell {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        int profit =0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit+=price[i]-price[i-1];
            }
        }
        System.out.println(profit);
    }

}
