// Last updated: 09/09/2026, 16:25:38
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }

        int left=0;
        List<Integer> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            max=Math.max(last[s.charAt(i)-'a'],max);
            if(i==max){
                list.add(i-left+1);
                left=i+1;
            }
        }
        return list;
    }
}