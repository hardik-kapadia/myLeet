class Solution {
    public boolean checkPossibility(int[] nums) {
        
        if(nums.length <= 2)
            return true;
        
        boolean modified = false;
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i] > nums[i+1])
            {
                if(modified)
                    return false;
                
                modified = true;
                
                if(i == 0)
                    nums[i] = nums[i+1];
                else if (i == nums.length-1)
                    nums[i] = nums[i-1];
                else{
                    
                    if(nums[i+1] >= nums[i-1])
                        nums[i] = nums[i+1];
                    else
                        nums[i+1] = nums[i];
                        
                }
                
            }
            
        }
        
        return true;
        
    }
}