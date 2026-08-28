class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer[] = new int[2];
        for(int i=0;i<nums.length;i++){
           int diff = target - nums[i];
           if(map.containsKey(diff)){
            answer[1] = i;
            answer[0] = map.get(diff);
            return answer;
           }
           map.put(nums[i], i);
        }
        return answer;
    }
}
