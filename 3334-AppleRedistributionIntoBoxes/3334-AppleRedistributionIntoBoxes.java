// Last updated: 24/12/2025, 23:18:15
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total=0;
        for(int i=0;i<apple.length;i++){
            total+=apple[i];
        }
        Arrays.sort(capacity);

        int ans=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(total<=0) break;
            ans++;
            total-=capacity[i];
        }
        return ans;
    }
}