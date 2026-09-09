// Last updated: 09/09/2026, 16:07:42
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int i:derived){
            xor^=i;
        }
        return xor==0;
    }
}