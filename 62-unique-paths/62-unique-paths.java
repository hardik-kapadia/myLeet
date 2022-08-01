class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m == 1 || n== 1)
            return 1;
        
        int[][] dp = new int[m+1][n+1];
    
        // Arrays.fill(dp[1],1);
        
        for(int i=1;i<=m;i++)
            dp[i][1] = 1;
        
        for(int i=1;i<=n;i++)
            dp[1][i] = 1;
        
        // for(int[] a : dp)
        //     System.out.println(Arrays.toString(a));
        
        
        for(int i=2;i<=m;i++)
            for(int j=2;j<=n;j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
        
        
        return dp[m][n];
        
        // return paths(m,n,dp);
        
    }
    
//     private int paths(int m, int n, int[][] dp){
        
//         if(dp[m][n] > 0)
//             return dp[m][n];
        
//         return dp[m][n] = uniquePaths(m-1,n) + uniquePaths(m,n-1);
        
//     }
}