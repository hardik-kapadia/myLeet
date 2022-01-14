class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
    vector<vector<int>> a;

    for (int i = 0; i < nums.size(); i++)
    {
        for (int j = i + 1; j < nums.size(); j++)
        {
            int req = target - (nums[i] + nums[j]);

            int k = j + 1;
            int l = nums.size() - 1;

            while (k < l)
            {
                int sum = nums[k] + nums[l];
                if (sum == req)
                {
                    vector<int> b;
                    b.push_back(nums[i]);
                    b.push_back(nums[j]);
                    b.push_back(nums[k]);
                    b.push_back(nums[l]);
                    if (count(a.begin(), a.end(), b) == 0)
                        a.push_back(b);
                    else
                        k++;
                }
                else if (sum < req)
                    k++;
                else
                    l--;
            }
        }
    }

    return a;
    }
};