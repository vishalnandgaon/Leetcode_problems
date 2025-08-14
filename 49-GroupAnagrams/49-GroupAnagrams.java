// Last updated: 14/08/2025, 11:34:54
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store the groups of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the input array
        for (String str : strs) {
            // Sort the string and use the sorted string as a key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // If the key doesn't exist, create a new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            // Add the original string to the list corresponding to the key
            map.get(sortedStr).add(str);
        }
        
        // Return the values of the map as the result
        return new ArrayList<>(map.values());
    }
}
/*class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    }
}*/