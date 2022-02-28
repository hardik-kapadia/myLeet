class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if len(nums) == 0:
            return []

        if len(nums) == 1:
            return [str(nums[0])]

        ans = []

        start = nums[0]
        temp = start

        i = 1

        while i < len(nums):

            if nums[i] == temp+1:
                temp += 1
                i += 1
                continue

            if temp == start:
                ans.append(str(temp))
            else:
                ans.append(str(start)+"->" + str(temp))

            start = nums[i]
            temp = start
            i += 1

        if temp == start:
            ans.append(str(temp))
        else:
            ans.append(str(start)+"->" + str(temp))
            
        return ans