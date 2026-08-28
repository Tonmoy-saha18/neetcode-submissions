class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String a:strs){
            char []chararr = a.toCharArray();
            Arrays.sort(chararr);
            String str = new String(chararr);
            List<String> ls = new ArrayList<>();
            if(map.containsKey(str)){
                ls = map.get(str);
            }else{
                map.put(str, ls);
            }
            ls.add(a);
            map.put(str, ls);
        }
        return new ArrayList<>(map.values());
    }
}
