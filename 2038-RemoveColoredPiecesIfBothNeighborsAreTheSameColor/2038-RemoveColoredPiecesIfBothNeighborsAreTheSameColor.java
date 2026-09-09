// Last updated: 09/09/2026, 16:12:29
class Solution {
    public boolean winnerOfGame(String colors) {
        int count1=0;
        int count2=0;
        int n=colors.length();
        for(int i=1;i<n-1;i++){
            if(colors.charAt(i-1)=='A' && colors.charAt(i)== 'A' && colors.charAt(i+1) =='A'){
                count1++;
            }
            else if(colors.charAt(i-1)=='B' && colors.charAt(i)== 'B' && colors.charAt(i+1) =='B'){
                count2++;
            }
        }
        return count1>count2;
    }
}