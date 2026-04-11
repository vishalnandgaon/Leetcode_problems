// Last updated: 11/04/2026, 22:42:47
class Solution {
    public int minOperations(int[] nums) {
        int max=200000;
        boolean[] isPrime=solve(max);

        int ops=0;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int step=0;
            if(i%2==0){
                while(!isPrime[num]){
                    num++;
                    step++;
                }
            }
            else{
                while(isPrime[num]){
                    num++;
                    step++;
                }
            }
            ops+=step;
        }
        return ops;
    }

    private boolean[] solve(int n){
        boolean[] isPrime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return isPrime;
    }
}