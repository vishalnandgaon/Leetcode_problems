// Last updated: 09/09/2026, 16:28:37
import java.util.*;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        Deque<Character> dq = new ArrayDeque<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (ch == '-') continue;

            if (count == k) {
                dq.addFirst('-');
                count = 0;
            }

            dq.addFirst(Character.toUpperCase(ch));
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : dq) sb.append(ch);

        return sb.toString();
    }
}