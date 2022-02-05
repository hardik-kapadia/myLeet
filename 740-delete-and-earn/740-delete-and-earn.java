class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + nums[i]);

        List<Integer> values = new ArrayList<>(map.keySet());
        Collections.sort(values);

        if (values.size() == 1)
            return map.get(values.get(0));


        int[] dp = new int[values.size()];
        dp[0] = map.get(values.get(0));
        dp[1] = values.get(0) == values.get(1) - 1 ? Math.max(dp[0], map.get(values.get(1)))
                : map.get(values.get(1)) + dp[0];

        for (int i = 2; i < values.size(); i++)
            if (values.get(i) == values.get(i - 1) + 1)
                dp[i] = Math.max(dp[i - 2] + map.get(values.get(i)), dp[i - 1]);
            else
                dp[i] = dp[i - 1] + map.get(values.get(i));

        // System.out.println("dp: " + Arrays.toString(dp));

        return dp[values.size() - 1];
    }
}