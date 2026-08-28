class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i] > 0){
                return ans;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i + 1, high = nums.length - 1;
            while(low < high){
                if(nums[i] + nums[low] + nums[high] > 0){
                    high -= 1;
                }
                else if(nums[i] + nums[low] + nums[high] < 0){
                    low += 1;
                }
                else{
                    ans.add(List.of(nums[i], nums[low], nums[high]));
                    low += 1;
                    while(nums[low] == nums[low - 1] && low < high){
                        low += 1;

                    }
                }
            }
        }
        return ans;
    }
}
