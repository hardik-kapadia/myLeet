class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int minCost = Integer.MAX_VALUE;
        
        
        int l = cost.length;
        
        int[] costToReach = new int[l+1];
        
        costToReach[0] = 0;
        costToReach[1] = 0;
        
        for(int i=2;i<=l;i++)
            costToReach[i] = Math.min(cost[i-2] + costToReach[i-2],cost[i-1] + costToReach[i-1]);
           
        return costToReach[l] ;
        
        
    }
}