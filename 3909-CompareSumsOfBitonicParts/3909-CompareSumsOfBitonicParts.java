// Last updated: 09/09/2026, 15:55:15
class Solution {
    public int compareBitonicSums(int[] nums) {
        int[] copy=nums;
        int n=copy.length;
        int peak=0;
        for(int i=1;i<n;i++){
            if(copy[i]>copy[i-1]){
                peak=i;
            }
        }
        long asc=0;
        for(int i=0;i<=peak;i++){
            asc+=copy[i];
        }
        long dsc=0;
        for(int i=peak;i<n;i++){
            dsc+=copy[i];
        }
        if(asc>dsc) return 0;
        else if(asc==dsc) return -1;
        return 1;
    }
}