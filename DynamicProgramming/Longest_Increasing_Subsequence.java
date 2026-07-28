public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] arr ={10,9,2,5,3,7,101,18};
        int n = arr.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i =1;i<n;i++){
            for(int j=0;j<i;j++){
                dp[i]=1;
            }
        }
    }

}
// i     arr[i]      previous smaller element       calculations      dp[i]
//0        10            none                         only 10           1
// 1       9             none                         only 9            1
// 2       2             none                         only 2            1
// 3       5              2                           dp[2]+1=1=1       2        
// 4       3              2                           dp[2]+1=1+1       2      
// 5       7             2,5,3                                             
// 6      101           10,9,2,5,3,7
// 7       18           10,9,2,5,3,7
// 
// 
// 
// 

