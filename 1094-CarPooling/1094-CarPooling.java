// Last updated: 09/09/2026, 16:21:18
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1001];
        for(int[] trip:trips){
            arr[trip[1]]+=trip[0];
            if(trip[2]<=1000){
                arr[trip[2]]-=trip[0];
            }
        }
        if(arr[0]>capacity) return false;
        for(int i=0;i<1000;i++){
            arr[i+1]=arr[i]+arr[i+1];
            if(arr[i+1]>capacity){
                return false;
            }
        }
        return true;
    }
}