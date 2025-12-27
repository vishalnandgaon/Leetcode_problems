// Last updated: 27/12/2025, 22:26:39
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,n=name.length(),m=typed.length();

        for(int j=0;j<m;j++){
            if( i<n && name.charAt(i)==typed.charAt(j)){
                i++;
            }
            else if(j==0 || typed.charAt(j) !=typed.charAt(j-1)){
                return false;
            }

        }
        return i==n;
    }
}