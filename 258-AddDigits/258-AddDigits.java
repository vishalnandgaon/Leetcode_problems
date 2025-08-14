// Last updated: 14/08/2025, 11:33:50
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num!=0){
                int first=num%10;
                sum+=first;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}