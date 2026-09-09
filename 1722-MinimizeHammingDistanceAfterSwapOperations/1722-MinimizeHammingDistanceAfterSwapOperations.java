// Last updated: 09/09/2026, 16:15:15
class Solution {
    class DSU{
        int parent[];
        DSU(int n){
            parent=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }

        int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        } 

        void union(int x,int y){
            int px=find(x);
            int py=find(y);
            if(px!=py){
                parent[px]=py;
            }
        }
    }
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        DSU dsu=new DSU(n);
        for(int[] swap:allowedSwaps){
            dsu.union(swap[0],swap[1]);
        }

        Map<Integer,Map<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int root=dsu.find(i);
            map.putIfAbsent(root,new HashMap<>());
            Map<Integer,Integer> freq=map.get(root);
            freq.put(source[i],freq.getOrDefault(source[i],0)+1);
        }

        int res=0;

        for(int i=0;i<n;i++){
            int root=dsu.find(i);
            Map<Integer,Integer> freq=map.get(root);
            if(freq.getOrDefault(target[i],0)>0){
                freq.put(target[i],freq.get(target[i])-1);
            }
            else{
                res++;
            }
        }
        return res;
    }
}