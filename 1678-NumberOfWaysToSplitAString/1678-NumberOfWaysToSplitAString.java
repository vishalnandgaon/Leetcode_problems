// Last updated: 26/12/2025, 22:31:53
class Solution {
    int Mod=1_000_000_007;
    public int numWays(String s) {
        
            char[] ch=s.toCharArray();
            int one=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='1'){
                    one++;
                }
            }

            if(one==0){
                long n=s.length();
                return (int) ((((n-1)*(n-2))/2)%Mod);
            }
            if(one%3!=0){
                return 0;
            }

            long ones=one/3;
            one=0;

            long part1=0,part2=0;
            for(char c:ch){
                if(c=='1'){
                    one++;
                }
                if(one==ones){
                    part1++;
                }
                if(one==2*ones){
                    part2++;
                }
            }

            return (int)((part1*part2)%Mod);
    }
}