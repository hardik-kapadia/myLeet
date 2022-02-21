class Solution {
    public int majorityElement(int[] nums) {
        
        // System.out.println("--------------");
        
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;){
            
            int val = nums[i];
            int j = i;
            while(i < nums.length && nums[i] == val) i++;
            
            int count = i - j;
            
            // System.out.println("Count for "+val+": "+count);
            
            if(count > nums.length/2)
                return val;
            
            
        }
        
        return -1;
        
        
        
    }
}