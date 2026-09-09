// Last updated: 09/09/2026, 16:24:10
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }

        int low=1;
        int high=max;
        while(low<=high){
            int mid= low+(high-low)/2;
            long count=0;
            for(int i=0;i<piles.length;i++){
                count+=(long) Math.ceil((double) piles[i]/mid);
            }
            if(count<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
}