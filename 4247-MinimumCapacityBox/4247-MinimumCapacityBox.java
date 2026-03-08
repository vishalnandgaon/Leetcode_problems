// Last updated: 08/03/2026, 21:32:29
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int[] arr=new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            arr[i]=capacity[i]-itemSize;
            if(arr[i]<0){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int minIdx=-1;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.min(arr[i],max);
        }
        if(max==Integer.MAX_VALUE) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                return i;
            }
        }
        return minIdx;
    }
}