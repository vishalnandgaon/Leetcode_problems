// Last updated: 04/01/2026, 23:49:21
class Solution {
    public List<List<String>> wordSquares(String[] words) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String w:words){
            String key=""+w.charAt(0)+w.charAt(3);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(w);
        }
        List<List<String>> res=new ArrayList<>();

        for(String top:words){
            for(String bottom:words){
                if(top.equals(bottom)) continue;

                String leftkey=""+top.charAt(0)+bottom.charAt(0);
                String rightkey=""+top.charAt(3)+bottom.charAt(3);

                if(!map.containsKey(leftkey) || !map.containsKey(rightkey)) continue;

                for(String left: map.get(leftkey)){
                    if(left.equals(top) || left.equals(bottom)) continue;

                for(String right:map.get(rightkey)){
                    if(right.equals(top) || right.equals(bottom) || right.equals(left)) continue;

                    res.add(Arrays.asList(top,left,right,bottom));
                }
            }
        }
    }

    res.sort((a,b) -> {
    for(int i=0;i<4;i++){
        int cmp=a.get(i).compareTo(b.get(i));
        if(cmp!=0) return cmp;
    }
    return 0;
    });

return res;
    
}
}