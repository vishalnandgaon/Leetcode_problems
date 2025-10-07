// Last updated: 07/10/2025, 23:45:16
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] arr=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            arr[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && additionalRocks>=arr[i]){
                additionalRocks=additionalRocks-arr[i];
                arr[i]=0;
            }
            if(arr[i]==0) count++;
            if(additionalRocks==0) break;
        }
        return count;
    }
}