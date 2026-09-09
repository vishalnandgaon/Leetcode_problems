// Last updated: 09/09/2026, 16:19:41
class Solution {
    public int[] sumZero(int n) {
        int left=-1;
        int right=1;
        int[] arr=new int[n];
        int i=0;
        if(n%2!=0){
            arr[0]=0;
            i++;
        }
        while(i<n){
            arr[i]=right;
            arr[i+1]=left;
            right++;
            left--;
            i+=2;
        }
        return arr;
    }
}