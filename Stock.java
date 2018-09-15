class Solution {
    int maxProfit = Integer.MIN_VALUE;
    
    public int maxProfit(int[] prices) {
        getProfit(prices, 0, false, 0);
        return maxProfit;
    }
    
    private void getProfit(int[] res, int index, boolean buy, int profit){
        maxProfit = Math.max(maxProfit, profit);
        
        if(index == res.length)  
            return;
        
        if(buy){
            getProfit(res, index+1, false, profit+res[index]);
            getProfit(res, index+1, true, profit);
        } else{ 
            getProfit(res, index+1, true, profit-res[index]);
            getProfit(res, index+1, false, profit);       
        }
    }
}
