// Last updated: 18/01/2026, 23:57:43
// class Solution {
//     public boolean help(int arr[], int s, int ed){
//         for(int i = s + 1; i < ed; i++){
//             if(arr[i]!=arr[i-1]+1) 
//                 return false;
//         }
//         return true;
//     }
//     public int help2(int n[], int i, int j){
//         int mx = 0;
//         for(int k = i; k < j; k++){
//             mx = Math.max(n[k], mx);
//         }
//         return mx;
//     }
//     public int[] resultsArray(int[] nums, int k) {
//         int ans[] = new int[nums.length - k + 1];
//         Arrays.fill(ans, -1);
//         for(int i = 0; i + k <= nums.length; i++){
//             if(help(nums, i, i + k)){
//                 ans[i] = help2(nums, i, i + k);
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        if (k == 1) return nums;
        int cnt = 0;
        for (int i = 0; i < k - 1; i++) {
            if (nums[i + 1] == nums[i] + 1)
                cnt++;
        }
        if (cnt == k - 1)
            ans[0] = nums[k - 1];
        for (int i = 1; i + k <= n; i++) {

            if (nums[i] == nums[i - 1] + 1)
                cnt--;
            if (nums[i + k - 1] == nums[i + k - 2] + 1)
                cnt++;

            if (cnt == k - 1)
                ans[i] = nums[i + k - 1];
        }

        return ans;
    }
}