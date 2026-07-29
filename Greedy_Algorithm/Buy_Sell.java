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
// iteration      i        yesterday         today>yesterday     profit
//   ->           0           7                  1>7(false)         0
// 1              1           1                  5>1(true)          4(profit=5-1)
// 2              2           5                  3>5(false)         4
// 3              3           3                  6>3(true)          7(profit=4+(6-3)) 
// 4              4           6
// 5              5           4
// 6
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
