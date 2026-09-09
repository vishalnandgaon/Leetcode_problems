// Last updated: 09/09/2026, 16:32:07
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        int[] indegree=new int[n];

        for(int[] pre:prerequisites){
            int a=pre[0];
            int b=pre[1];

            list.get(b).add(a);

            indegree[a]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                ans.add(i);
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int course=q.poll();
            count++;

            for(int nbrs: list.get(course)){
                indegree[nbrs]--;
                if(indegree[nbrs]==0){
                    ans.add(nbrs);
                    q.add(nbrs);
                }
            }
        }
        int size=ans.size();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=ans.get(i);
        }

        return arr.length==n?arr:new int[]{};
    }
}