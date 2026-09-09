// Last updated: 09/09/2026, 16:07:58
class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        long[] arr=new long[n];
        for(ArrayList<Integer> list:map.values()){
            int size=list.size();
            long[] prefix=new long[size];
            prefix[0]=list.get(0);
            for(int i=1;i<size;i++){
                prefix[i]=prefix[i-1]+list.get(i);
            }

            for(int i=0;i<size;i++){
                long left=0;
                long right=0;
                // left part contri
                if(i>0){
                    left=(long)list.get(i)*i -(prefix[i-1]);
                }
                // right contri
                if(i<size-1){
                    right=(prefix[size-1]-prefix[i])-(long)list.get(i)*(size-i-1);
                }

                arr[list.get(i)]=left+right;
            }
        }
        return arr;
    }
}