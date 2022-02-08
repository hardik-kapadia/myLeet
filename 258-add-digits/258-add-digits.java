class Solution {
    public int addDigits(int num) {
        
        if(num < 10)
            return num;
        
        char[] chars = String.valueOf(num).toCharArray();
        
        
        while(true){
            
            chars = String.valueOf(num).toCharArray();
            
            int sum = 0;
        
            for(char ch: chars)
                sum += (ch - 48);
        
            if(sum < 10)
                return sum;
            
            num = sum;
        
        
            }   
        }
}