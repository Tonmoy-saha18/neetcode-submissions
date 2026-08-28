class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
       set_ls = set()
       for a in nums:
        if a in set_ls:
            return True
        set_ls.add(a)
       return False
         