class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;

        if (k == 0)
            return;

        Queue<Integer> q = new ArrayDeque<>();

        int i;

        for (i = 0; i < k; i++) {
            q.add(nums[i]);
            nums[i] = nums[l - k + i];
        }

        for (; i < nums.length; i++) {
            q.add(nums[i]);
            nums[i] = q.poll();
        }
    }
}