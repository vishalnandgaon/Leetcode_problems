// Last updated: 09/09/2026, 16:25:11
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();

        for(int key=0;key<graph.length;key++){
            if(visited.containsKey(key)){
                continue;
            }

            q.add(new BipartitePair(key,0));
            while(!q.isEmpty()){
                BipartitePair rp=q.poll();

                if(visited.containsKey(rp.vtx)){
                    if(rp.dis !=visited.get(rp.vtx)){
                        return false;
                    }
                    continue;
                }

                visited.put(rp.vtx,rp.dis);

                // self work ,yahan kuch nhi hai

                for(int i:graph[rp.vtx]){
                    if(!visited.containsKey(i)){
                        q.add(new BipartitePair(i,rp.dis+1));
                    }
                }
            }
        }
        return true;

    }


    class BipartitePair{
        int vtx;
        int dis;

        BipartitePair(int vtx,int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }
}