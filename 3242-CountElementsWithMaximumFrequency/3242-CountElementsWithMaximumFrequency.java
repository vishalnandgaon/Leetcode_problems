// Last updated: 22/09/2025, 10:33:45
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int max=0;
        for(int i:nums){
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                ans+=freq[i];
            }
        }
        return ans;
    }
}