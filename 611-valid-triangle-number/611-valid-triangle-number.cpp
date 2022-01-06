class Solution {
public:
    int triangleNumber(vector<int>& nums) {
    int count = 0;

    sort(nums.begin(), nums.end());

    for (size_t i = nums.size()-1; i > 1; i--)
    {
        int lo = 0;
        int hi = i - 1;

        while (hi > lo)
            if (nums[hi] + nums[lo] > nums[i])
            {
                count += hi - lo;
                // cout << "i: " << i << ",lo: " << lo << ",hi: " << hi << endl;
                hi--;
            }
            else
                lo++;
    }

    // cout << "Count: " << count;

    return count;
    }
};