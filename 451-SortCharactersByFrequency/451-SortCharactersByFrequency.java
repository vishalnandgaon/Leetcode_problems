// Last updated: 11/10/2025, 23:35:37
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c,0)+1);

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char c = pq.poll();
            for(int i=0; i<freq.get(c); i++) sb.append(c);
        }
        return sb.toString();
    }
}
