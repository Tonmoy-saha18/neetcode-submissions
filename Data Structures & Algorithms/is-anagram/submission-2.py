class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dic1 = {}
        dic2 = {}
        for i in range(len(s)):
            if s[i] not in dic1:
                dic1[s[i]] = 0
            dic1[s[i]] += 1
            if t[i] not in dic2:
                dic2[t[i]] = 0
            dic2[t[i]] += 1
        
        for a in dic1:
            if a not in dic2 or dic1[a] != dic2[a]:
                return False
        return True
        