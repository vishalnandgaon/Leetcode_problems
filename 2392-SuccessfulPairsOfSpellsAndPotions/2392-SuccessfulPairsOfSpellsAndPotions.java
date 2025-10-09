// Last updated: 09/10/2025, 21:17:27
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=potionsuccess(spells[i],potions,success);
        }
        return ans;
    }

    private int potionsuccess(int element,int[] potions,long success){
        int low=0;
        int high=potions.length;
        while(low<high){
            int mid=low+(high-low)/2;

            if((long)element*potions[mid]<success){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return potions.length-low;
    }
}