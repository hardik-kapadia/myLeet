class Solution {
    public int titleToNumber(String columnTitle) {
        
        int sum = 0;
        
        char[] ch = columnTitle.toCharArray();
        
        for(int i = 0;i<ch.length;i++)
            sum = sum * 26 + ch[i] - 64;
        
        return sum;
        
        
    }
}