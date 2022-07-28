class Solution {
    public int[][] merge(int[][] intervals) {
        
        int[][] merged = new int[intervals.length][2];
        
        Arrays.sort(intervals,Comparator.comparingInt(p -> p[0]));
        
        int intervalCount = 0;
        
        for(int i=0;i<intervals.length;i++){
            
            int s = intervals[i][0];
            int e = intervals[i][1];
            
            boolean fit = false;
            
            for(int j = 0;j<intervalCount;j++){
                
                if(merged[j][1] >= s && merged[j][0] <= e){
                    merged[j][0] = Math.min(merged[j][0],s);
                    merged[j][1] = Math.max(merged[j][1],e);
                    fit=true;
                    break;
                }
                
            }
            
            if(!fit)
                merged[intervalCount++] = new int[]{s,e};
            
            
        }
        
        return Arrays.copyOfRange(merged,0,intervalCount);
        
        
    }
}