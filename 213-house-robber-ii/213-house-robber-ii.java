class Solution {
    public int rob(int[] nums) {
        
        // System.out.println("---------------");
        
        if(nums.length == 1)
            return nums[0];
        
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        
        if(nums.length == 3)
            return Math.max(Math.max(nums[1],nums[0]),nums[2]);

        int l = nums.length;
        
        int[][] dp = new int[l][2];
        
        dp[0][0] = nums[0];
        dp[1][0] = Math.max(nums[0],nums[1]);
        
        dp[0][1] = 0;
        dp[1][1] = nums[1];
        
        for(int i=2;i < l;i++){
            
            int add = nums[i];
            
            if(i == l-1)
                add = 0;
            
            dp[i][0] = Math.max(dp[i-2][0] + add,dp[i-1][0]);
            dp[i][1] =Math.max(dp[i-2][1] + nums[i] ,dp[i-1][1]);
        }
        
        // for(int[] is: dp)
        //     System.out.println(Arrays.toString(is));
        
        
        return Math.max(dp[l-1][0],dp[l-1][1]);
        
    }
    
    private int mod(int a, int b){
        int c = a%b;
        return c<0?b+c:c;
    }
}