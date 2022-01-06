class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        
        if(len <= 1 || expand(s,len/2,len/2) == len || expand(s,(len/2) -1,len/2) == len)
            return s;

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {

            int l1 = expand(s, i, i);
            int l2 = expand(s, i, i + 1);

            int l = Math.max(l1, l2);

            if (l > end - start) {
                start = i - ((l - 1) / 2);
                end = i + (l / 2);
            } 

        }

        return s.substring(start, end + 1);

    }

    private int expand(String s, int l, int r) {
        if (s == null || l > r)
            return 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }

}