class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1)
            return nums[0] == k ? 1 : 0;

        int[] sum = new int[nums.length];

        sum[0] = nums[0];
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < nums.length; i++)
            sum[i] = sum[i - 1] + nums[i];

        int ans = 0;

        for (int i = 0; i < sum.length; i++) {

            if (sum[i] == k)
                ans++;

            if (map.containsKey(sum[i] - k))
                ans += map.get(sum[i] - k);

            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);

        }

        return ans;
    }
}