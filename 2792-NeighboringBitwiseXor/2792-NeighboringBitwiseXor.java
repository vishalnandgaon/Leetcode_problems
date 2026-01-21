// Last updated: 21/01/2026, 14:31:56
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int i:derived){
            xor^=i;
        }
        return xor==0;
    }
}