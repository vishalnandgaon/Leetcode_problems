// Last updated: 05/04/2026, 21:35:13
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int limit=(int) Math.cbrt(n)+1;

        for(int a=1;a<=limit;a++){
            int a3=a*a*a;
            for(int b=a;b<=limit;b++){
                int sum=a3+b*b*b;
                if(sum>n) break;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}