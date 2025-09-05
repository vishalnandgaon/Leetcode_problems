// Last updated: 05/09/2025, 07:48:32
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder st= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            st.append(arr[i]);
        }
        
        return st.toString();
    }
}