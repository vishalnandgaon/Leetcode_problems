// Last updated: 09/09/2026, 16:19:40
class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(start);

        while(!q.isEmpty()){
            int idx=q.poll();
            if(idx<0 || idx>=n || visited[idx]==true){
                continue;
            }
            if(arr[idx]==0) return true;
            visited[idx]=true;
            q.offer(idx-arr[idx]);
            q.offer(idx+arr[idx]);
        }
        return false;
    }
}