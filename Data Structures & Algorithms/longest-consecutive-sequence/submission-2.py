class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numsSet = set(nums)
        maxSeq = 0
        for a in nums:
            if a - 1 not in numsSet:
                seq = 1
                while a + 1 in numsSet:
                    a += 1
                    seq += 1
                if maxSeq < seq:
                    maxSeq = seq
        return maxSeq

        