class Solution {
    public int search(int[] nums, int target) {
        
        int lb = 0;
        int ub = nums.length-1;
        
        while(ub >= lb){
            
            int mid = (lb + ub)/2;
            
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] < target)
                lb = mid+1;
            else
                ub = mid-1;
            
        }
        
        return -1;
        
        
    }
}