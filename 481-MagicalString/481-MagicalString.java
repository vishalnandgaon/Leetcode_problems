// Last updated: 09/09/2026, 16:28:41
class Solution {

    public int magicalString(int n) {

        // Base cases
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        // Magical string array
        int[] arr = new int[n + 2];

        // Initial string = "122"
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;

        // head -> reads instructions
        int head = 2;

        // tail -> next insert position
        int tail = 3;

        // next number to insert
        int num = 1;

        // already one '1' exists
        int ones = 1;

        while (tail < n) {

            // arr[head] tells how many times to insert num
            for (int i = 0; i < arr[head]; i++) {

                arr[tail] = num;

                // count 1's
                if (num == 1 && tail < n) {
                    ones++;
                }

                tail++;
            }

            // switch number between 1 and 2
            if (num == 1) {
                num = 2;
            } else {
                num = 1;
            }

            // move instruction pointer
            head++;
        }

        return ones;
    }
}