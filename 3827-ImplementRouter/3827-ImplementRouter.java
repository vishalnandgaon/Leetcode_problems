// Last updated: 21/09/2025, 15:16:10
import java.util.*;

class Router {

    private static class Packet {
        int src, dst, ts;
        Packet(int s, int d, int t) {
            src = s; dst = d; ts = t;
        }
    }

    private final int limit;
    private final Queue<Packet> queue;
    private final Set<String> seen; // to detect duplicates
    private final Map<Integer, List<Integer>> dstToTimestamps;
    private final Map<Integer, Integer> dstToStartIdx;

    public Router(int memoryLimit) {
        this.limit = memoryLimit;
        this.queue = new ArrayDeque<>();
        this.seen = new HashSet<>();
        this.dstToTimestamps = new HashMap<>();
        this.dstToStartIdx = new HashMap<>();
    }

    public boolean addPacket(int src, int dst, int ts) {
        String key = src + "#" + dst + "#" + ts;
        if (seen.contains(key)) return false;

        if (queue.size() == limit) { // remove oldest
            Packet old = queue.poll();
            seen.remove(old.src + "#" + old.dst + "#" + old.ts);

            // mark forwarded in destination list
            int idx = dstToStartIdx.getOrDefault(old.dst, 0);
            dstToStartIdx.put(old.dst, idx + 1);
        }

        Packet p = new Packet(src, dst, ts);
        queue.offer(p);
        seen.add(key);

        dstToTimestamps.computeIfAbsent(dst, k -> new ArrayList<>()).add(ts);
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[0];

        Packet p = queue.poll();
        seen.remove(p.src + "#" + p.dst + "#" + p.ts);

        // mark forwarded in destination list
        int idx = dstToStartIdx.getOrDefault(p.dst, 0);
        dstToStartIdx.put(p.dst, idx + 1);

        return new int[]{p.src, p.dst, p.ts};
    }

    public int getCount(int dst, int start, int end) {
        List<Integer> list = dstToTimestamps.get(dst);
        if (list == null) return 0;

        int startIdx = dstToStartIdx.getOrDefault(dst, 0);

        // binary search for lower bound >= start
        int l = lowerBound(list, start, startIdx);
        // binary search for upper bound > end
        int r = upperBound(list, end, startIdx);

        return r - l;
    }

    private int lowerBound(List<Integer> list, int target, int from) {
        int l = from, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) >= target) r = m;
            else l = m + 1;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target, int from) {
        int l = from, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) > target) r = m;
            else l = m + 1;
        }
        return l;
    }
}
