class Solution {
    public int maxProfit(int[] prices) {
        int []rightmax = new int[prices.length];
        int max = 0;
        for(int i=prices.length - 1;i>=0;i--){
            if(max < prices[i]){
                max = prices[i];
            }
            rightmax[i] = max;
        }
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(maxprofit < (rightmax[i] - prices[i])){
                maxprofit = rightmax[i] - prices[i];
            }
        }
        return maxprofit;
        
    }
}
