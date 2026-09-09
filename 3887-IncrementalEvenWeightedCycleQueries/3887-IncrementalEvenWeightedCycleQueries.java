// Last updated: 09/09/2026, 15:56:55
class Solution {
    int[] parent;
    int[] rank;
    int[] parity;
    public int numberOfEdgesAdded(int n, int[][] edges) {
        int[][] arr=edges;
        parent=new int[n];
        rank=new int[n];
        parity=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            parity[i]=0;
        }

        int count=0;
        for(int e[]:arr){
            int u=e[0],v=e[1],w=e[2];

            if(union(u,v,w)){
                count++;
            }
        }
        return count;
    }


    private boolean union(int u,int v,int w){
        int ru=find(u);
        int rv=find(v);

        if(ru==rv){
            return ((parity[u]^parity[v]^w)==0);
        }
        if(rank[ru]<rank[rv]){
            parent[ru]=rv;
            parity[ru]=parity[u]^parity[v]^w;
        }
        else{
            parent[rv]=ru;
            parity[rv]=parity[u]^parity[v]^w;
            if(rank[ru]==rank[rv]) rank[ru]++;
        }
        return true;
    }

    private int find(int x){
        if(parent[x]!=x){
            int original=parent[x];
            parent[x]=find(parent[x]);
            parity[x]^=parity[original];
        }
        return parent[x];
    }
}