//Leetcode
//122. Best Time to Buy and Sell Stock II

//Whenever tomorrow's price is higher than today's price, take that increase as profit.

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




// This is a very common DSA problem on LeetCode.

// It is the problem commonly known as Best Time to Buy and Sell Stock II (LeetCode 122).

// But there's an important distinction: your exact code solves the “multiple transactions” version, where you can buy and sell multiple times.

// For:

// int[] price = {7,1,5,3,6,4};

// Your code does:

// 1 → 5 = +4
// 3 → 6 = +3
// Total = 7

// So your output is:

// 7

// That's correct for the Stock II problem.

// Why your logic works

// This:

// if(price[i] > price[i-1]){
//     profit += price[i] - price[i-1];
// }

// essentially collects every upward movement.

// For:

// 7 → 1 → 5 → 3 → 6 → 4

// you can think of it as:

// 7 → 1       no profit
// 1 → 5       +4
// 5 → 3       no profit
// 3 → 6       +3
// 6 → 4       no profit

// Total:

// 4 + 3 = 7
// One thing to watch for

// There is also a similar LeetCode problem where you can make only ONE transaction.

// For the same array:

// [7,1,5,3,6,4]

// the answer there is:

// 5

// because you buy at 1 and sell at 6.

// So when you see a stock problem, first identify whether multiple transactions are allowed or only one. Your current algorithm is specifically appropriate for the multiple-transaction version.
