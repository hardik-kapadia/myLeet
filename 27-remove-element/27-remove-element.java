class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0)
            return 0;
    
        if(nums.length == 1)
            return nums[0] == val ? 0 : 1;
        
       int count = 0;

        int u = nums.length - 1;

        int i = 0;

        while (true) {

            while (nums[u] == val) {
                count++;
                u--;
                
                if(u < 0)
                    return 0;
            }


            if (i > u)
                break;

            if (nums[i] == val) {
                nums[i] = nums[u];
                nums[u] = val;
            }
            
            i++;

        }

        return i;
    }
}