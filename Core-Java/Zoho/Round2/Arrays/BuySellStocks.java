package Zoho.Round2.Arrays;


public class BuySellStocks {
    public static void main(String[] args) {
        // int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println("Output: " + maxProfit_BF(prices));
        System.out.println("Output: " + maxProfit_OP(prices));

    }
    public static int maxProfit_BF(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than two prices
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // Update the minimum price if the current price is lower
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Update the maximum profit if selling at the current price yields a higher profit
        }
        return maxProfit;
    }

    public static int maxProfit_OP(int[] prices) {
        int lowestSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit;

        for(int i = 0; i < prices.length; i++){
            if (prices[i] < lowestSoFar) {
                lowestSoFar = prices[i];
            }
            currentProfit = prices[i] - lowestSoFar;
            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}

/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*/