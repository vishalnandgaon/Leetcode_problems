// Last updated: 11/10/2025, 23:36:55
class Solution {
    public int candy(int[] ratings) {
        if(ratings.length==1) return 1;
        int n=ratings.length;
        int[] arr=new int[n];
        Arrays.fill(arr,1);

        // ab left to right jaao

        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1] + 1;
            }
        }
        // ab right to left jao
        for(int i=n-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                arr[i-1]=Math.max(arr[i-1],arr[i] + 1);
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}