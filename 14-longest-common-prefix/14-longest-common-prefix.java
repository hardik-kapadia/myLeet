class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String prefix = "";
        StringBuilder pref = new StringBuilder();

        for (int i = 0; i < strs[0].length() && i < strs[1].length(); i++) {
            char c1 = strs[0].charAt(i);
            char c2 = strs[1].charAt(i);

            if (c1 != c2)
                break;

            pref.append(c1);
        }

        prefix = pref.toString();
        int l = prefix.length();

        if (l == 0)
            return "";

        char[] cc = prefix.toCharArray();

        for (int i = 2; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            
            
            if (l > ch.length)
                l = ch.length;

            for (int j = 0; j < strs[i].length() && j < l; j++) {
                if (ch[j] != cc[j]) {
                    l = j;
                    break;
                }

            }
            

        }
        
        return prefix.substring(0, l);
    }
}