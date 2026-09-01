class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxFreq = 0, ans = 0;
        int []freqArr = new int[26];
        while(right < s.length()){
            char ch = s.charAt(right);
            freqArr[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freqArr[ch - 'A']);
            while((right - left - maxFreq + 1) > k){
                freqArr[s.charAt(left) - 'A']--;
                left++;
            }
                ans = Math.max(ans, right - left + 1);
                right++;
        }
        return ans;
        
    }
}