class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            int []freq = new int[26];
            for(int j=0;j<strs[i].length();j++){
                freq[strs[i].charAt(j)-'a']++;
            }
            String a = "";
            for(int k=0;k<26;k++){
                if(freq[k] > 0){
                    a += (char) (k + 'a') + String.valueOf(freq[k]);
                }
            }
            List<String> ls = map.getOrDefault(a, new ArrayList<String>());
            ls.add(strs[i]);
            map.put(a, ls);
        }
        return new ArrayList<>(map.values());
    }
}
