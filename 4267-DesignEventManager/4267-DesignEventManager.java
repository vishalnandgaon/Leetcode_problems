// Last updated: 29/03/2026, 22:44:56
class EventManager {
    private PriorityQueue<int[]> pq;
    private Map<Integer,Integer> map;
    public EventManager(int[][] events) {
        int[][] arr=events;
        map=new HashMap<>();
        pq=new PriorityQueue<>((a,b)->{
            if(b[1]!=a[1]) return b[1]-a[1];
            return a[0]-b[0];
        });

        for(int[] e:arr){
            int id=e[0];
            int priority=e[1];
            map.put(id,priority);
            pq.offer(new int[]{id,priority});
        }
    }
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        pq.offer(new int[]{eventId,newPriority});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] top=pq.poll();
            int idd=top[0];
            int pri=top[1];

            if(map.containsKey(idd) && map.get(idd)==pri){
                map.remove(idd);
                return idd;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */