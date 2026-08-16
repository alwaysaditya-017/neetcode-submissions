class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minvalue = prices[0];
        for(int i =1; i< prices.length ;i++){
            minvalue = Math.min(prices[i] ,minvalue);
            res = Math.max(res , prices[i] - minvalue);
        }
        return res;
        
    }
}
