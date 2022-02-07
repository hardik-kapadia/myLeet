class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        int sum =0;
        
        for(int i=0;i<sc.length;i++)
                sum+=tc[i] - sc[i];
        
        
        return (char) (sum + tc[tc.length-1]);
        
    }
}