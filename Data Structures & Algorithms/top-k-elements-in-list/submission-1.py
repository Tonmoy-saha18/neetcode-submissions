class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = {}
        freq = [[] for i in range(len(nums) + 1)]
        for a in nums:
            hashMap[a] = hashMap.get(a, 0) + 1;
        for key, v in hashMap.items():
            freq[v].append(key)
        answer = []
        for i in range(len(freq) -1, 0, -1):
            for a in freq[i]:
                answer.append(a)
                if len(answer) == k:
                    return answer
        