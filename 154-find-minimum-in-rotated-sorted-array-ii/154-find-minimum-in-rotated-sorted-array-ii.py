class Solution:
    def findMin(self, nums: List[int]) -> int:
        
        if len(nums) == 1:
            return nums[0]
        
        l = len(nums)

        min_index = 0
        max_index = l - 1

        rotattions = 0

        while nums[max_index] <= nums[min_index] and rotattions <= l:

            rotattions += 1

            min_index = (min_index + 1) % l
            max_index = (max_index + 1) % l

        return nums[min_index]
        