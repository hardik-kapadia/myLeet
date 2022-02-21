class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> count = new HashMap<>();
        
        int target = nums.length/2;
        
        for(int i=0;i<nums.length;i++){
            
            int val = nums[i];
            
            int c = count.getOrDefault(val,0) + 1;
            
            if(c > target)
                return val;
            
            count.put(val,c);
            
            
        }
        
        return -1;
        
        
        
    }
}