class Solution {
    public int maxPower(String s) {
        
        int power = 0;
        
        int i=0;
        
        while(i < s.length()){
            
            char c = s.charAt(i);
            int j = i;
            
            while(i < s.length())
                if(s.charAt(i) != c) break;
                else i++;
            
            
            power = Math.max(power,i-j);
            
        }
        
        return power;
        
    }
}