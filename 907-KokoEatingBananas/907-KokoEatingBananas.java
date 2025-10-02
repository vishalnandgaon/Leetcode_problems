// Last updated: 02/10/2025, 10:54:40
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int num:piles){
            max=Math.max(num, max);
        }
        int left=1;
        int right=max;
        int res=0;
        while(left<=right){
            long ans=0;
            int mid=(left+right)/2;
            for(int i=0;i<piles.length;i++){
                ans+=(long)Math.ceil((double)piles[i]/mid);
            }
            if(ans<=h){
                res=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return res;
    }
}