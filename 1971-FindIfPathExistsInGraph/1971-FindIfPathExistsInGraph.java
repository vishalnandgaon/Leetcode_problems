// Last updated: 09/09/2026, 16:12:37
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] arr:edges){
            int v=arr[0],u=arr[1];
            map.get(v).add(u);
            map.get(u).add(v);
        }

        Set<Integer> visited=new HashSet<>();
        return solve(source,destination,map,visited);
    }

    private boolean solve(int s,int d,HashMap<Integer,List<Integer>> map,Set<Integer> visited){
        if(s==d){
            return true;
        }

        visited.add(s);
        for(int v:map.get(s)){
            if(!visited.contains(v)){
                boolean ans=solve(v,d,map,visited);
                if(ans) return true;
            }
        }
        return false;
    }
}