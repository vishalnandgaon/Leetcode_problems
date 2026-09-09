// Last updated: 09/09/2026, 16:07:46
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int[] arr=new int[A.length+1];
        int[] freq=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[A[i]]+=1;
            if(arr[A[i]]==2) count++;
            arr[B[i]]+=1;
            if(arr[B[i]]==2) count++;

            freq[i]=count;
        }
        return freq;
    }
}