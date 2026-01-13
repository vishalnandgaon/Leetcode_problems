// Last updated: 13/01/2026, 22:51:47
class Solution {
    public int minOperations(int n, int m) {
        boolean[] isPrime = sieve();
        int[] dist = new int[10001];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = n; 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{n, n});
        
        HashSet<Integer> visited = new HashSet<>();
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int num = cur[0];
            int cost = cur[1];
            
            if (visited.contains(num) || isPrime[num]) continue;
            if (num == m) return cost;
            
            visited.add(num);
            StringBuilder sb = new StringBuilder(Integer.toString(num));
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (c != '9') {
                    sb.setCharAt(i, (char)(c + 1));
                    int nextNum = Integer.parseInt(sb.toString());
                    int newCost = cost + nextNum;
                    if (!isPrime[nextNum] && dist[nextNum] > newCost) {
                        dist[nextNum] = newCost;
                        pq.add(new int[]{nextNum, newCost});
                    }
                    sb.setCharAt(i, c);
                }
                
                if (c != '0') {
                    sb.setCharAt(i, (char)(c - 1));
                    int nextNum = Integer.parseInt(sb.toString());
                    int newCost = cost + nextNum;
                    if (!isPrime[nextNum] && dist[nextNum] > newCost) {
                        dist[nextNum] = newCost;
                        pq.add(new int[]{nextNum, newCost});
                    }
                    sb.setCharAt(i, c);
                }
            }
        }
        
        return -1;
    }
    private boolean[] sieve() {
        int MAX = 10001;
        boolean[] isPrime = new boolean[MAX];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}