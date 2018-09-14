class Solution {
    public int maxProfit(int[] prices) {
       return getProfit(prices, 0);
    }
    
    private static int getProfit(int[] res, int index){
        if(index >= res.length)
            return 0;
        int maxProfit = 0, max = 0;
        for(int i = index; i < res.length; i++){
            int profit = 0;
            for(int j = i + 1; j < res.length; j++){
                profit = res[j]-res[i] + getProfit(res, j+1);
                if(profit > max)
                    max = profit;
            }
            if(max > maxProfit)
                maxProfit = max;
        }
        return maxProfit;
    }
}
