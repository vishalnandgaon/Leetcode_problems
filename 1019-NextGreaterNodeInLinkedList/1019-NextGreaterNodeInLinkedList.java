// Last updated: 09/09/2026, 16:22:14
class Solution {
    public int[] nextLargerNodes(ListNode head) {

        // Step 1: Convert LinkedList to ArrayList
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // stack of indices

        // Step 2: Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && list.get(st.peek()) <= list.get(i)) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? 0 : list.get(st.peek());
            st.push(i);
        }

        return ans;
    }
}
