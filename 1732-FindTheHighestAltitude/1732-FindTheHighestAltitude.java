// Last updated: 09/09/2026, 16:15:22
class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
}