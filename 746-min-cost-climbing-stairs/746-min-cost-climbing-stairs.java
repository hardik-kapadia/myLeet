class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
        int step1=0,step2=0;
        
        int currentStep;
        
        for(int i=cost.length-1;i>=0;i--){
            
            currentStep = cost[i] + Math.min(step1,step2);
            step1 = step2;
            step2 = currentStep;
            
        }
           
        return Math.min(step1,step2);
        
        
    }
}