// Last updated: 15/03/2026, 21:24:21
class Solution {
    public int longestArithmetic(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;

        int[] left=new int[n];
        int[] right=new int[n];

        Arrays.fill(left,2);
        Arrays.fill(right,2);

        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                left[i]=left[i-1]+1;
            }
        }

        for(int i=n-3;i>=0;i--){
            if(nums[i+1]-nums[i]==nums[i+2]-nums[i+1]){
                right[i]=right[i+1]+1;
            }
        }
        int ans=2;
        for(int i=1;i<n-1;i++){
            ans=Math.max(ans,left[i+1]+1);
            ans=Math.max(ans,right[i+1]+1);

            if((nums[i+1]-nums[i-1])%2==0){
                int d=(nums[i+1]-nums[i-1])/2;
                int leftLen=1;
                int rightLen=1;
                if(i>=2 && nums[i-1]-nums[i-2]==d){
                    leftLen=left[i-1];
                }
                if(i+2<n && nums[i+2]-nums[i+1]==d){
                    rightLen=right[i+1];
                }
                ans=Math.max(ans,leftLen+rightLen+1);
            }
        }
        return Math.min(ans,n);
    }
}