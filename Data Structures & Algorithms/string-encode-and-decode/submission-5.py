class Solution:

    def encode(self, strs: List[str]) -> str:
        encodedString = ""
        for a in strs:
            encodedString += str(len(a)) + "#" + a
        return encodedString
    def decode(self, s: str) -> List[str]:
        ans = []
        i = 0
        while i < len(s):
            j = i 
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            ans.append(s[j+1:j + length + 1])
            i = j + length + 1
        return ans
