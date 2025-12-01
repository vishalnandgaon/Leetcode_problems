// Last updated: 01/12/2025, 22:44:31
class Solution {
    public boolean canrun(long x, int[] batteries,int n){
        long power=0;
        for(int p:batteries){
            power+=Math.min(p,x);
        }

        return power>=x*n;
    }

    public long maxRunTime(int n, int[] batteries) {
        // Sbse phle ye maximum kitne time chal skte h 
        long total_power=0;
        for(int i=0;i<batteries.length;i++){
            total_power+=batteries[i];
        }
        long maxtime=total_power/n;
        long left=0;
        long right=maxtime;

        while(left<right){
            long mid=(left+right+1)/2;

            if(canrun(mid,batteries,n)){
                left=mid;
            }
            else{
                right=mid-1;
            }
        }

        return left;
    }
}