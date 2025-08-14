// Last updated: 14/08/2025, 11:34:11
/*class Solution {
    public String reverseWords(String s) {
        
    }
}*/
public class Solution {
    public String reverseWords(String s) {
        // Split the string by spaces and filter out empty strings caused by extra spaces
        String[] words = s.trim().split("\\s+");
        
        // Reverse the words array
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {  // Add a space between words, but not after the last word
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
