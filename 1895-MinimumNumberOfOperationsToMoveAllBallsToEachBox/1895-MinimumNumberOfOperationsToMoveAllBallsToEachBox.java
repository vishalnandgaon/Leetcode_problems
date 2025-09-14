// Last updated: 14/09/2025, 21:36:32
class Solution {
    public int[] minOperations(String boxes) {
        char[] box=boxes.toCharArray();
        int[] ans=new int[box.length];
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box.length;j++){
                if(box[j]-'0'==1){
                    ans[i]+=Math.abs(i-j);
                }
            }
        }
        return ans;
    }
}