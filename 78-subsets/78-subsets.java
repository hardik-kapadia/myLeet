class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        if (nums.length == 1)
            return new ArrayList<>(List.of(new ArrayList<>(), List.of(nums[0])));

        return helper(nums, nums.length);

    }

    private List<List<Integer>> helper(int[] nums, int till) {

        if (till == 1)
            return new ArrayList<>(List.of(new ArrayList<>(), List.of(nums[0])));

        List<List<Integer>> temp = helper(nums, till - 1);

        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(temp);

        for (List<Integer> list : temp) {
            List<Integer> t = new ArrayList<>(list);
            t.add(nums[till-1]);
            ans.add(t);
        }

        return ans;


    }
}