// Last updated: 14/08/2025, 11:33:42
/*class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    }
}*/
import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Count frequency of each element in nums1
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the intersection and store result
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);  // Decrement the count
            }
        }

        // Step 3: Convert the result list to an array and return
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}
