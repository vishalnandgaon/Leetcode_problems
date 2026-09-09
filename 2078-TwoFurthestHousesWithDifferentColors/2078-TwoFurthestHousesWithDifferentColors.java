// Last updated: 09/09/2026, 16:11:52
class Solution {
    public int maxDistance(int[] colors) {
        int maxdiff=0;
        int left=0;
        int right=colors.length-1;
        while(left<right){
            while(colors[left]==colors[right]){
                left++;
            }
            maxdiff=Math.max(right-left,maxdiff);
            break;
        }
        left=0;
        right=colors.length-1;
        while(left<right){
            while(colors[left]==colors[right]){
                right--;
            }
            maxdiff=Math.max(right-left,maxdiff);
            break;
        }
        return maxdiff;
    }
}