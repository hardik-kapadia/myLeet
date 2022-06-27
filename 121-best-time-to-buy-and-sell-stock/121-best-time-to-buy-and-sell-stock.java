class Solution {
    public int maxProfit(int[] prices) {
        
        int cp = Integer.MAX_VALUE;
        
        int profit = 0;
        
        boolean owned = false;
        
        for(int i=0;i<prices.length;i++){
            
            
            if(prices[i] < cp){
                cp = prices[i];
                owned = true;
                continue;
            }
            
            if(owned)
                if(prices[i] - cp > profit)
                    profit = prices[i] - cp;
            
            
            
        }
        
        return profit;
    }
}