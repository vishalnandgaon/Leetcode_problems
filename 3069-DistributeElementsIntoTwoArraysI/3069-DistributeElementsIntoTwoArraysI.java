// Last updated: 09/09/2026, 16:05:18
class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(list.get(list.size()-1)>list2.get(list2.size()-1)){
                list.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int i=0;
        for(int j=0;j<list.size();j++){
            arr[i]=list.get(j);
            i++;
        }
        for(int j=0;j<list2.size();j++){
            arr[i]=list2.get(j);
            i++;
        }
        return arr;
    }
}