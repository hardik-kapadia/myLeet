class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // Arrays.sort(nums3);
        // Arrays.sort(nums4);

        // corrsponds to a 2d array of int[nth array][currentSum] = count;
        List<HashMap<Integer, Integer>> dp = new ArrayList<>();

        for (int i = 0; i < 4; i++)
            dp.add(new HashMap<>());

        int count = helper(nums1, nums2, nums3, nums4, dp, 0, 0);

        // System.out.println("dp: " + dp);

        return count;
    }

    private int helper(int[] nums1, int[] nums2, int[] nums3, int[] nums4, List<HashMap<Integer, Integer>> dp,
            int currentSum, int currentArray) {

        // System.out.println("Now we have " + currentSum + " at " + currentArray + "
        // with " + dp);

        if (currentArray == 4)
            return currentSum == 0 ? 1 : 0;

        if (dp.get(currentArray).containsKey(currentSum))
            return dp.get(currentArray).get(currentSum);

        int[] nums = switch (currentArray) {
            case 0 -> nums1;
            case 1 -> nums2;
            case 2 -> nums3;
            case 3 -> nums4;
            default -> null;
        };

        int count = 0;

        for (int i = 0; i < nums.length; i++)
            count += helper(nums1, nums2, nums3, nums4, dp, currentSum + nums[i], currentArray + 1);

        dp.get(currentArray).put(currentSum, count);

        return count;

    }
}