// Last updated: 09/09/2026, 16:34:22
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int length=0;
        for(int num:set){
            int count=0;
            if(!set.contains(num-1)){
                int len=1;
                count++;
                while(set.contains(num+len)){
                    count++;
                    len++;
                }
            }
            length=Math.max(length,count);
        }
        return length;
    }
}