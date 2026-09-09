// Last updated: 09/09/2026, 16:26:44
class Solution {
    public int repeatedStringMatch(String a, String b) {
        int l=b.length();
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(sb.length()<l){
            sb.append(a);
            count++;
        }

        if(sb.toString().contains(b)) return count;
        sb.append(a);
        if(sb.toString().contains(b)) return count+1;
        return -1;
    }
}