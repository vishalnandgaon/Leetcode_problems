// Last updated: 09/09/2026, 16:33:58
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp=new Boolean[s.length()];
        return solve(s,wordDict,0,dp);
    }

    private boolean solve(String s,List<String> wordDict,int idx,Boolean[] dp){
        if(idx==s.length()) return true;

        for(int i=idx;i<s.length();i++){
            if(dp[idx]!=null) return dp[idx];
            String part=s.substring(idx,i+1);

            if(wordDict.contains(part)){
                if(solve(s,wordDict,i+1,dp)){
                    dp[idx]=true;
                    return dp[idx];
                }
            }
        }
        return dp[idx]=false;
    }
}