// Last updated: 13/09/2025, 22:25:40
class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> has=new HashSet<>();
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            has.add(nums[i]);
            sum+=nums[i];
        }
        int res=sum/n;
        int ans=0;
        for(int i=1;i<=101;i++){
            if(res<i && !has.contains(i)){
                ans=i;
                break;
            }
            }
    return ans;
    }
}