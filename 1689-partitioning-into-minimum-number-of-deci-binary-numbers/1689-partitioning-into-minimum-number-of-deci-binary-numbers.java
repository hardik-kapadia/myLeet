class Solution {
    public int minPartitions(String n) {
        
        int max = -1;
        
        for(int i=0;i<n.length();i++){
            max = Math.max(n.charAt(i) - '0',max);
            
            if(max == 9)
                return 9;
        }
        
        
        return max;
        
    }
}