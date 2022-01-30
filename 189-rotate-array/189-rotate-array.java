class Solution {
    public void rotate(int[] nums, int k) {
        
        int l = nums.length;

        if( k >= l)
            k = k % l;

        if (k == 0)
            return;

        int[] result = new int[l];

        System.arraycopy(nums, l - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, l - k);
        System.arraycopy(result, 0, nums, 0, l);
    }
}