class Solution {
    public boolean judgeCircle(String moves) {
        
        int r = 0;
        int u = 0;
        
        char[] ch = moves.toCharArray();
        
        for(char c: ch){
            
            switch(c){
                case 'R':
                    r++;
                    break;
                case 'L':
                    r--;
                    break;
                case 'U':
                    u++;
                    break;
                case 'D':
                    u--;
                    break;
            }
            
        }
        
        return r == 0 && u == 0;
        
        
        
        
    }
}