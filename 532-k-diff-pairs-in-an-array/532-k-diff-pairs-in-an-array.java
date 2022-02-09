class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        Set<Integer> set = new HashSet<>();
        
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(set.contains(nums[i]))
                continue;
            
            int target = nums[i] + k;
            
            int lb = i+1;
            int ub = nums.length-1;
            
            while(ub >= lb){
                
                int mid = (lb + ub)/2;
                
                if(nums[mid] == target){
                    set.add(nums[i]);
                    break;
                } else if (nums[mid] > target)
                    ub = mid-1;
                else
                    lb = mid+1;
                
            }
            
            
        }
        
        return set.size();
        
        
    }
}