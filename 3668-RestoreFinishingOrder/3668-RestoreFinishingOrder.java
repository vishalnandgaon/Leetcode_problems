// Last updated: 09/09/2026, 15:58:01
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendset=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            friendset.add(friends[i]);
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<order.length;j++){
            if(friendset.contains(order[j])){
                ans.add(order[j]);
            }
        }

        int[] res=new int[friends.length];
        for(int i=0;i<friends.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}