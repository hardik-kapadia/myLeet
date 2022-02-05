class Solution {
    public int jump(int[] nums) {

        if (nums.length == 1)
            return 0;

        int[] dp = new int[nums.length];

        Arrays.fill(dp, 100000);

        dp[0] = 0;

        for (int i = 0; i < nums.length; i++) {

            if (dp[i] == 100000)
                continue;

            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++)
                dp[j] = Math.min(dp[j], dp[i] + 1);

        }

        return dp[nums.length-1];

    }
}