class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = {}
        for a in nums:
            if a not in hashMap:
                hashMap[a] = 0
            hashMap[a] += 1
            
        return [a[0] for a in sorted(hashMap.items(), key=lambda x:x[1], reverse=True)][:k]
        