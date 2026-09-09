// Last updated: 09/09/2026, 16:32:12
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

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
                    q.add(nbrs);
                }
            }
        }

        return count==n;
    }
}