class Solution {
    public int longestPalindrome(String s) {
        
        Set<Character> has = new HashSet<>();
        
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            if(has.contains(c)){
                has.remove(c);
                count +=2;                
            } else {
                has.add(c);
            }
            
        }
        
        if(has.size() > 0)
            count++;
        
        return count;
        
        
    }
}