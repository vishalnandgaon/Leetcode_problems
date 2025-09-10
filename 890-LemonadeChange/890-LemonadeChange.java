// Last updated: 10/09/2025, 12:54:30
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int bill:bills){
            if(bill==5){
                five++;
            }
            else if(bill==10){
                if(five==0) return false;
                five--;
                ten++;
            }
            else{
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
}