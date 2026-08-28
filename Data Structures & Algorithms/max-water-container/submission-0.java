class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = 0;
        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = width * height;
            if(area > max){
                max = area;
            }

            if(heights[left] < heights[right]){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return max;
        
    }
}
