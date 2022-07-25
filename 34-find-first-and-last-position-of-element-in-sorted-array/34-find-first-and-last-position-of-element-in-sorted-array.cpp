class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        int pos = -1;
        
        int lb = 0;
        int ub = nums.size()-1;
        
        while(ub >= lb){
            
            int mid = (ub + lb)/2;
            
            if(nums[mid] == target){
                pos = mid;
                break;
            }
            
            if(nums[mid] > target)
                ub = mid - 1;
            else
                lb = mid+1;
            
        }
        
        if(pos == -1)
            return {-1,-1};
        
        
        int begin = pos;
        int end = pos;
        
        while(true){
            
            if(begin == 0 || nums[begin-1] != target)
                break;
            
            begin--;
                    
        }
        
        while(true){
            
            if(end == nums.size()-1 || nums[end+1] != target)
                break;
            
            end++;
                    
        }
        
        return {begin,end};
        
    }
};