// Last updated: 09/09/2026, 16:26:52
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] count=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int maxlen=1;
        int answer=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];

                    }
                    else if(dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }
                }

            }
            if(dp[i]>maxlen){
                maxlen=dp[i];
                answer=count[i];
            }
            else if(dp[i]==maxlen){
                answer+=count[i];
            }
        }
        return answer;
    }
}