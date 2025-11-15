// Last updated: 15/11/2025, 22:46:46
class Solution {
    private int GCD(int num1,int num2){
        if(num1==0){
            return num2;
        }
        return GCD(num2%num1,num1);
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones++;
            }
        }
        // agar number of ones >=1 hai 
        if(ones>0){
            return n-ones;
        }

        // number of ones 0 hai , toh ab find karenge minmum subarray jiska gcd 1 ho
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int gcd=0;
            for(int j=i;j<n;j++){
                gcd=GCD(gcd,nums[j]);
                if(gcd==1){
                    int len=j-i+1;
                    minlen=Math.min(len,minlen);
                    break;
                }
            }
        }
        // maan ke chalo minlen mili hi nhi
        if(minlen==Integer.MAX_VALUE){
            return -1;
        }
        return (minlen-1)+(n-1);
    }
}