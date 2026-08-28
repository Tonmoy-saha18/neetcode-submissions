class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for a in strs:
            arr = [0]*26
            for i in range(len(a)):
                arr[ord(a[i]) - ord ('a')] += 1
            key = ''
            for i in range(26):
                if arr[i] > 0:
                    key += chr(i + ord('a')) + str(arr[i])
            ls = []
            if key in dic:
                ls = dic[key]
            else:
                dic[key] = ls
            ls.append(a)
            dic[key] = ls
        return dic.values()

            


        