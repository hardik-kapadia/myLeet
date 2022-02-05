class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 1)
            return true;
        
        boolean[] canReach = new boolean[nums.length];
        canReach[0] = true;
        
        for(int i =0;i < nums.length -1;i++)
        {
            
            if(!canReach[i])
                continue;
            
            for(int j = i+1;j <= i+nums[i] && j < nums.length;j++)
                canReach[j] = true;
            
            if(canReach[nums.length-1])
                return true;
        }
        
        return false;
        
    }
}