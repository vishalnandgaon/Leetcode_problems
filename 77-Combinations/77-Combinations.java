// Last updated: 11/10/2025, 23:37:07
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        solve(1,n,list,new ArrayList<>(),k);
        return list;
    }
    private void solve(int start,int n,List<List<Integer>> list,List<Integer> current,int k){

        if(current.size()==k){
            list.add(new ArrayList<>(current));
            return;
        }

        for(int i=start;i<=n;i++){
            current.add(i);
            solve(i+1,n,list,current,k);
            current.remove(current.size()-1);
        }
    }
}