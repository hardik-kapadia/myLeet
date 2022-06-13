class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        List<List<Integer>> dp = new ArrayList<>();
        
        int l = triangle.size();
        
        for(int i=0;i<l-1;i++)
            dp.add(new ArrayList<>());
        
        dp.add(new ArrayList<>(triangle.get(l-1)));
        
        
        System.out.println(dp);
        
        
        for(int i = l-2;i>=0;i--){
            
            List<Integer> temp = dp.get(i);
            List<Integer> temper = dp.get(i+1);
            
            for(int j = 0;j<=i;j++)
                temp.add(triangle.get(i).get(j) + Math.min(temper.get(j),temper.get(j+1)));
                
            
        }
        
        System.out.println(dp);
        
        return dp.get(0).get(0);
        
    }
}