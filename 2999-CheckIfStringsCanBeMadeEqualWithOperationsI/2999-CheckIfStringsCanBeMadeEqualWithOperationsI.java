// Last updated: 30/03/2026, 21:46:06
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        StringBuilder sb=new StringBuilder();
        sb.append(s2.charAt(0));
        sb.append(s2.charAt(3));
        sb.append(s2.charAt(2));
        sb.append(s2.charAt(1));
        String s=sb.toString();
        if(s.equals(s1)) return true;
        sb.setLength(0);
        sb.append(s2.charAt(2));
        sb.append(s2.charAt(1));
        sb.append(s2.charAt(0));
        sb.append(s2.charAt(3));
        s=sb.toString();
        if(s.equals(s1)) return true;
        sb.setLength(0);
        sb.append(s2.charAt(2));
        sb.append(s2.charAt(3));
        sb.append(s2.charAt(0));
        sb.append(s2.charAt(1));
        s=sb.toString();
        if(s.equals(s1)) return true;
        return false;
    }
}