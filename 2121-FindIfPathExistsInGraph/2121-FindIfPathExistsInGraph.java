// Last updated: 01/01/2026, 22:57:50
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
            int v1=edge[0],v2=edge[1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        HashSet<Integer> visited =new HashSet<>();
        return hasPath(source,destination,map,visited);

    }

    public boolean hasPath(int src,int des,HashMap<Integer,List<Integer>> map,HashSet<Integer> visited){
        if(src==des) return true;
        visited.add(src);
        for(int nbrs:map.get(src)){
            if(!visited.contains(nbrs)){
                boolean ans=hasPath(nbrs,des,map,visited);
                 if(ans){
                return true;
            }
            }
           
        }
        return false;

    }
}