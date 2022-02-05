class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length== 1)
            return nums[0];
        
        int currMax = nums[0];
        
        for(int i=1;i<nums.length;i++){
            nums[i] = Math.max(nums[i-1] + nums[i],nums[i]);
            currMax = Math.max(currMax,nums[i]);
        }
        
        return currMax;
        
    }
}