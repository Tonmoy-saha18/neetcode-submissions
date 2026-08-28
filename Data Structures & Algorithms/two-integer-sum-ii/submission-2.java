class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        int []arr = new int[2];

        while(low <= high){
            if(numbers[low] + numbers[high] == target){
                arr[0] = low + 1;
                arr[1] = high + 1;
                return arr;
            }

            if(numbers[low] + numbers[high] > target){
                high -= 1;
            }
            else{
                low += 1;
            }
        }
        return arr;
    }
}
