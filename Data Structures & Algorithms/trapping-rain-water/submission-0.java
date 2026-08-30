class Solution {
    public int trap(int[] height) {
        int []maxleftarr = new int[height.length];
        int []maxrightarr = new int[height.length];
        int maxleft = 0;
        int maxright = 0;
        int right = height.length - 1;
        for(int i = 0;i<height.length;i++){
            if(maxleft < height[i]){
                maxleft = height[i];
            }
            maxleftarr[i] = maxleft;

            if(maxright < height[right]){
                maxright = height[right];
            }
            maxrightarr[right] = maxright;
            right--;
        }
        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum += Math.min(maxleftarr[i], maxrightarr[i]) - height[i];
        }
        return sum;
    }
}
