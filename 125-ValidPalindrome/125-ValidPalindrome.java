// Last updated: 14/08/2025, 11:34:18
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String t=s.replaceAll("[^a-z0-9]","");
    if(t.equals("")){
        return true;
    }
    else{
        int count=0;
        int i=0;
        int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
        if(count>0){
            return false;
        }
        else{
            return true;
        }
    }
}
}