class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = left + 1;
        int maxProfit = 0;

        while(right < prices.length){
            if(prices[right] < prices[left]){
                left = right;
                right++;
                continue;
            }
            if((prices[right] - prices[left]) > maxProfit){
                maxProfit = prices[right] - prices[left];
            }
            right++;
        }
        return maxProfit;
    }
}
