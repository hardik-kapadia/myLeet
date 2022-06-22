class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        for(int i=0;i<k;i++){
            
            int index = i;
            
            for(int j =i;j<nums.length;j++)
                if(nums[j] > nums[index])
                    index = j;
                
            int t = nums[index];
            nums[index] = nums[i];
            nums[i] = t;
            
        }
        
        return nums[k-1];
        
    }
}