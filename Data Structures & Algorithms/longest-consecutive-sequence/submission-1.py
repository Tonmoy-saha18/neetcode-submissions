class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        nums = sorted(nums)
        maxSeq = 0
        seq = 0
        for i in range(len(nums) - 1):
            if nums[i] == nums[i+1] - 1:
                seq += 1
            elif nums[i] == nums[i+1]:
                seq = seq
            else:
                seq = 0
            if maxSeq < seq:
                maxSeq = seq
        return maxSeq + 1

        