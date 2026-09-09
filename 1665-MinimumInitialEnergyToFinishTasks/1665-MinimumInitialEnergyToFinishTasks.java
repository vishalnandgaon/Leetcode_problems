// Last updated: 09/09/2026, 16:16:07
class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->{
            int diffa=a[1]-a[0];
            int diffb=b[1]-b[0];
            return Integer.compare(diffb,diffa);
        });

        int start=tasks[0][1];
        int rem=tasks[0][1];
        for(int i=0;i<tasks.length;i++){
            if(rem>=tasks[i][1]){
                rem-=tasks[i][0];
            }
            else{
                int diff=tasks[i][1]-rem;
                rem+=diff;
                start+=diff;
                rem-=tasks[i][0];
            }
        }
        return start;
    }
}