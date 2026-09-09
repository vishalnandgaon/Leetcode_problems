// Last updated: 09/09/2026, 16:26:08
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        // Now relax all edges , bhaii we are using bell man ford , so relax toh banta hai na 
        for(int i=1;i<n;i++){
            boolean update=false;
            for(int[] edge:times){
                int u=edge[0],v=edge[1],w=edge[2];

                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    update=true;
                }
            }
           if(!update) break;
        }

        int ans=0;
        for(int i=1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }

        return ans;
    }
}