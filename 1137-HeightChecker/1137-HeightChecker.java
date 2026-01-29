// Last updated: 29/01/2026, 22:21:57
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                count++;
            }
        }
        return count;
    }
}