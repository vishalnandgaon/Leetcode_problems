// Last updated: 31/08/2025, 21:13:59
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