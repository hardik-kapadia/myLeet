class Solution {
    public boolean canJump(int[] nums) {

        Map<Integer, Boolean> reachables = new HashMap<>();
        reachables.put(0, true);

        return canReach(nums, nums.length - 1, reachables);
    }

    boolean canReach(int[] nums, int index, Map<Integer, Boolean> reachables) {

        // System.out.println("Now looking at: " + index);

        if (reachables.containsKey(index))
            return reachables.get(index);

        int i = 1;

        while (i <= index) {
            if (nums[index - i] >= i)
                if (canReach(nums, index - i, reachables)) {
                    reachables.put(index - i, true);
                    return true;
                }
            i++;
        }

        reachables.put(index, false);

        return false;

    }
}