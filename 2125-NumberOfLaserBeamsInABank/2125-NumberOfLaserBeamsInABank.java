// Last updated: 09/09/2026, 16:11:19
class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list=new ArrayList<>();
        int m=bank.length;
        int n=bank[0].length();
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count>=1) list.add(count);
        }

        if(list.size()<=1) return 0;
        int ans=0;
        int i=0;
        while(i<list.size()-1){
            ans+=list.get(i)*list.get(i+1);
            i++;
        }
        return ans;
    }
}