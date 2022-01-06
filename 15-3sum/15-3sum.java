class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            int lo = i + 1;
            int hi = nums.length - 1;

            while (lo < hi){
                
                int sum = nums[i] + nums[lo] + nums[hi];
                
                if (sum == 0)
                    ans.add(Arrays.asList( nums[i], nums[lo++], nums[hi--] ));
                else if (sum > 0)
                    hi--;
                else
                    lo++;
            }

        }

        return new ArrayList<>(ans);
    }
}