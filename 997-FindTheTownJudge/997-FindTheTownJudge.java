// Last updated: 09/09/2026, 16:22:31
class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i+1,new ArrayList<>());
        }
        int[] outdegree=new int[n+1];
        for(int[] arr:trust){
            int v=arr[0],u=arr[1];
            map.get(u).add(v);
            outdegree[v]++;
        }

        for(int i=1;i<=n;i++){
            if(map.get(i).size()==n-1 && outdegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}