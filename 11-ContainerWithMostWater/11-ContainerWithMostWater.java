// Last updated: 16/08/2025, 17:58:50
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_water=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            max_water=Math.max(max_water,width*h);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_water;
    }
}