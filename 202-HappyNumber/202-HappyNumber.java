// Last updated: 01/09/2025, 21:18:52
class Solution {
    public int sumOfSquare(int b){
        int sum=0;
        while(b!=0){
            int temp=b%10;
            sum+=(temp*temp);
            b/=10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        Set<Integer> nums=new HashSet<>();
        while(true){
            int temp=sumOfSquare(n);
            if(nums.contains(temp)){
                return false;
            }
            if(temp==1){
                return true;
            }
            nums.add(temp);
            n=temp;
        }
    }
}