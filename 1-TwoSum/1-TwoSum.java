// Last updated: 14/08/2025, 11:35:45
class Solution {
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int s = arr[i] + arr[j]; 
                if (s == target) {
                    return new int[] {i, j}; 
                }
            }
        }
        return new int[] {}; 
    }
}