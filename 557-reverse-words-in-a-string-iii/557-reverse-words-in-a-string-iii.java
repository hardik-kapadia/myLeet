class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        String[] words = s.strip().split(" ");
        
        StringBuilder temp;
        
        for(String word:words)
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        
        return sb.substring(0,sb.length() -1);
        
        
        
    }
}