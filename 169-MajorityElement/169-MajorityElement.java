// Last updated: 21/09/2025, 15:17:56
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if((map.get(num))>(n/2)) return num;
        }
        return -1;
    }
}