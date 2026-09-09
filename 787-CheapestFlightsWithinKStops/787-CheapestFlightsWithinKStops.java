// Last updated: 09/09/2026, 16:25:06
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        for(int i = 0; i <= k; i++){

            int[] temp = dist.clone();

            for(int[] f : flights){

                int u = f[0];
                int v = f[1];
                int w = f[2];

                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < temp[v]){
                    temp[v] = dist[u] + w;
                }
            }

            dist = temp;
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}