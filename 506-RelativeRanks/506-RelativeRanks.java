// Last updated: 29/09/2025, 22:51:09
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue <int[]> pq=new PriorityQueue<>((a,b) -> b[0]-a[0]);
        String[] ans=new String[score.length];
        for(int i=0;i<score.length;i++){
            pq.add(new int[]{score[i],i});
        }

        int rank=1;
        while(pq.size()>0){
            int[] top=pq.poll();
            int idx=top[1];
            if(rank==1){
                ans[idx]="Gold Medal";
            }
            else if(rank==2){
                ans[idx]="Silver Medal";
            }
            else if(rank==3){
                ans[idx]="Bronze Medal";
            }
            else{
                ans[idx]=rank+"";
            }
            rank++;
        }
        return ans;
    }
}