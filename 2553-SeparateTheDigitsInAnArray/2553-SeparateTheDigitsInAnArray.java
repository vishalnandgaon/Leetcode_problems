// Last updated: 09/09/2026, 16:08:19
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int y=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            while(x>0){
                list.add(y,x%10);
                x/=10;
            }
            y=list.size();

        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}