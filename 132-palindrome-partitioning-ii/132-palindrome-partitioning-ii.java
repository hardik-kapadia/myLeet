class Solution {
    int[] dp;

    public int minCut(String s) {

        if (s.length() <= 1 || isPalindrome(s, 0, s.length() - 1))
            return 0;

        if (s.length() == 2)
            return 1;

        dp = new int[s.length() + 1];

        dp[s.length()] = 0;
        dp[s.length() - 1] = 0;

        Arrays.fill(dp, Integer.MAX_VALUE);

        return f(s.toCharArray(), 0);

    }

    int f(char[] s, int i) {

        if (dp[i] != Integer.MAX_VALUE)
            return dp[i];

        if (i >= s.length - 1)
            return dp[i] = 0;

        if (isPalindrome(s, i, s.length - 1))
            return dp[i] = 0;

        int count = Integer.MAX_VALUE;

        for (int j = i; j < s.length; j++) {
            if (isPalindrome(s, i, j)) {
                if (dp[j + 1] != Integer.MAX_VALUE)
                    count = Math.min(count, dp[j + 1] + 1);
                else
                    count = Math.min(count, f(s, j + 1) + 1);
            }
        }

        // System.out.println("for " + i + " -> " + count);
        dp[i] = count;

        return count;

    }

    boolean isPalindrome(String str, int i, int j) {

        return isPalindrome(str.toCharArray(), i, j);
    }

    boolean isPalindrome(char[] str, int i, int j) {

        while (i < j)
            if (str[i++] != str[j--])
                return false;

        return true;
    }
}