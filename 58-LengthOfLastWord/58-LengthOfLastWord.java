// Last updated: 14/08/2025, 11:34:41
public class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any leading or trailing spaces
        s = s.trim();
        
        // Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}
