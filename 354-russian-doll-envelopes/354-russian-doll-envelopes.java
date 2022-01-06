class Solution {
    public int lengthOfRussianDoll(int index, int[][] envelopes, int[] dp) {

        if (index > envelopes.length - 1)
            return 0;

        if (dp[index] > 0)
            return dp[index];

        int max = 0;

        for (int i = index + 1; i < envelopes.length; i++)
            if (envelopes[index][1] > envelopes[i][1] && envelopes[index][0] > envelopes[i][0])
                max = Math.max(max, lengthOfRussianDoll(i, envelopes, dp) + 1);

        dp[index] = max;

        return dp[index];
    }

    public int maxEnvelopes(int[][] envelopes) {

        int[] dp = new int[envelopes.length];

        Arrays.sort(envelopes, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                int wdiff = o2[0] - o1[0];
                int hdiff = o2[1] - o1[1];
                if (wdiff != 0)
                    return wdiff;
                else if (hdiff != 0)
                    return hdiff;
                else
                    return 1;
            }

        });

        int maxCount = 0;
        for (int i = 0; i < envelopes.length; i++) {
            int temp = 
            maxCount = Math.max(maxCount, lengthOfRussianDoll(i, envelopes, dp) + 1);
        }


        return maxCount;
    }
}