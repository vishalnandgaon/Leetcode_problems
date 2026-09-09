// Last updated: 09/09/2026, 16:16:43
class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../") && count==0){
                count=0;
            }
           else  if(logs[i].equals("../")){
                count--;;
            }
            else if(!logs[i].equals("./")){
                count++;
            }
        }
        return count;
    }
}