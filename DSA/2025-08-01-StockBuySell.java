//  Best Time to Buy and Sell Stock — LeetCode #121


class Solution {
    public int maxProfit(int[] prices) {
    int buy=Integer.MAX_VALUE;
    int profit=0;
    for(int price : prices){
        if(price < buy ) buy=price;     // lowest price

        else if (price - buy > profit )  profit=price-buy;
    }
    return profit;

       } 
    }
