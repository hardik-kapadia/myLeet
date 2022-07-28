class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        cSum(candidates,target,current,0,0,result);
        
        return result;
        
    }
    
    private void cSum(int[] candidates, int target, List<Integer> current, int sum, int index, List<List<Integer>> result){
    
        
        if(sum == target){
        
            
            if(!result.contains(current))
                result.add(new ArrayList<>(current));
            
            
            return;
            
        }
        
        if(sum > target)
            return;
        
        for(int i=index;i<candidates.length;i++){
            current.add(candidates[i]);
            cSum(candidates,target,current,sum + candidates[i],i,result);
            current.remove(current.size()-1);
        }
        
    }
}