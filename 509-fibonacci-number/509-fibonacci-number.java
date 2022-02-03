class Solution {
    public int fib(int n) {
        
        if(n == 0)
            return 0;
        
        if(n == 1)
            return 1;
        
        int[] fb = new int[n+1];
        
        fb[0] = 0;
        fb[1] = 1;
        
        for(int i=2;i<=n;i++)
            fb[i] = fb[i-1]+fb[i-2];
        
        return fb[n];
        
    }
}