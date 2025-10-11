// Last updated: 11/10/2025, 23:36:57
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> ans=new ArrayList<>();

        solve(s,list,ans,0);

        return list;
    }
    private void solve(String s,List<List<String>> list,List<String> ans,int start){

        if(start==s.length()){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start;i<s.length();i++){
            String sub=s.substring(start,i+1);
            if(isPalindrome(sub)){
                ans.add(sub);
                solve(s,list,ans,i+1);
                ans.remove(ans.size()-1);
            }
            
        }
    }

    private boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) !=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}