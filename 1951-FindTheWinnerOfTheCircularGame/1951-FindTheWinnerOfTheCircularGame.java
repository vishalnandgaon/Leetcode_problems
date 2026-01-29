// Last updated: 29/01/2026, 22:20:26
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }

        int curr_idx=0;
        while(list.size()>1){
            int del=(curr_idx+k-1)%list.size();
            list.remove(del);
            curr_idx=del;

        }
        return list.get(0);
        
    }
}