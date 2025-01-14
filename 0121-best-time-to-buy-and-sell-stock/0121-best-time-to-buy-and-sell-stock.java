class Solution {
    public int maxProfit(int[] prices) {
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingprice<prices[i]){
                int profit = prices[i] - buyingprice ;
                maxprofit = Math.max(maxprofit,profit);
            }
            else
                buyingprice = prices[i];
        }
        return maxprofit ;
    }
}