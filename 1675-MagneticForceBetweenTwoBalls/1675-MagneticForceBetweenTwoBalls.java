// Last updated: 01/10/2025, 17:49:47
class Solution {
    private boolean canplace(int[] arr,int mid,int n){
        int count=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                count++;
                last=arr[i];
            }
            if(count>=n) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int high=position[n-1]-position[0];
        int result=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(canplace(position,mid,m)){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}