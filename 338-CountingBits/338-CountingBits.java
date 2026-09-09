// Last updated: 09/09/2026, 16:30:26
class Solution {
    public int[] countBits(int n) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<=n;i++){
        //     list.add(Integer.bitCount(i));
        // }
        // int[] arr=new int[list.size()];
        // for(int i=0;i<=n;i++){
        //     arr[i]=list.get(i);
        // }
        // return arr;

        // DP Solution
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[(i>>1)] +(i & 1);
        }
        return dp;
    }
}