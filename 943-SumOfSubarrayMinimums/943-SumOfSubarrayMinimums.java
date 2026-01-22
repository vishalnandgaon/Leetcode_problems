// Last updated: 22/01/2026, 12:34:14
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int nse[] = new int[n];
        int pse[] = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                pse[i] = -1;
            } else {
                pse[i] = stack.peek();
            }
            stack.push(i);
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(pse[i]+" ");
        // }
        stack.clear();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[i] = n;
            } else {
                nse[i] = stack.peek();
            }
            stack.push(i);
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(nse[i]+" ");
        // }

        long mod = 1_000_000_007;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            sum = (sum + left * right % mod * arr[i]) % mod;
        }

        return (int) sum;
    }
}