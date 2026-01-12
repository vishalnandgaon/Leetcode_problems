// Last updated: 12/01/2026, 22:47:51
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(bloomDay[i],low);
            high=Math.max(bloomDay[i],high);
        }


        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(canmake(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean canmake(int[] bloomDay,int m,int k,int mid){
        int bouquet=0;
        int flowers=0;

        for(int bloom:bloomDay){
            if(bloom<=mid){
                flowers++;
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                }
            }

            else{
                flowers=0;
            }
        }
        return bouquet>=m;
    }
}