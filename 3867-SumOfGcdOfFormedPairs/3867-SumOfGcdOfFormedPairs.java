// Last updated: 09/09/2026, 15:56:08
class Solution {
    private int gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            a=a%b;
            b=a;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            arr[i]=gcd(nums[i],max);
        }

        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;
            j--;
        }
        return sum;
    }
}