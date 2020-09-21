package com.company.sep15;
/*Say you have an array for which the ith element is the price of a given stock on day i.
        If you were only permitted to complete at most one transaction
        (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
        Note that you cannot sell a stock before you buy one.*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;

        int maximumProfit = 0;
        for(int i=prices.length-1; i>0; i--){
            int sellingPrice = prices[i];
            for(int j=0; j<i; j++){
                int temp = sellingPrice - prices[j];
                if( temp> 0 && maximumProfit < temp)
                    maximumProfit = temp;
            }
        }
        return maximumProfit;
    }
}