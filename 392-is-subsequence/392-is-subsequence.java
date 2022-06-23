class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(t.length() < s.length())
            return false;
        
        if(t.length() == s.length())
            return t.equals(s);
        
        int j = 0;
        
        int charS = s.length();
        int charT = t.length();
        
        for(int i=0;i<t.length() && j<s.length();i++){
            
            if(s.charAt(j) == t.charAt(i)){
                j++;
                charS--;
                charT--;
                continue;
            }
            
                charT--;
            
            if(charS > charT)
                return false;
            
        }
        
        return true;
        
    }
}