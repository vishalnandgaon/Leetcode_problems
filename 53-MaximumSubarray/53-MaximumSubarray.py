# Last updated: 09/09/2026, 16:36:30
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum=nums[0]
        maxsum=nums[0]

        for num in nums[1:]:
            currsum=max(num,currsum+num)
            maxsum=max(maxsum,currsum)
        return maxsum    