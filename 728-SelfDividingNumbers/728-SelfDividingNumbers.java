// Last updated: 01/09/2025, 21:18:29
class Solution {
    public boolean isSelfDividing(int num){
        int temp=num;
        while(temp!=0){
            int unit=temp%10;
            if(unit==0 || (num%unit)!=0){
                return false;
            }
            temp/=10;

        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}