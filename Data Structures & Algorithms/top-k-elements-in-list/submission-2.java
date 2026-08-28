class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] trackerArr = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
           if(!map.containsKey(num)){
            map.put(num, 0);
           }
           map.put(num, map.get(num) + 1);
        }
        for(int k2:map.keySet()){
            if(trackerArr[map.get(k2)] == null){
                trackerArr[map.get(k2)] = new ArrayList<>();
            }
            trackerArr[map.get(k2)].add(k2);
        }
        int []ans = new int[k];
        int j = 0;
        for(int i = nums.length; (i>=0 && k>0); i--){
            if(trackerArr[i] == null || trackerArr[i].isEmpty()){
                continue;
            }
            for(Integer a:trackerArr[i]){
                ans[j] = a;
                j++;
                k--;
            }
        }

        return ans;
        
    }
}
