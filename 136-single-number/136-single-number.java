class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> numbs = new HashSet<>();
        
        for(int i:nums)
            if(numbs.contains(i))
                numbs.remove(i);
            else
                numbs.add(i);
            
        return numbs.iterator().next();
        
        
    }
}