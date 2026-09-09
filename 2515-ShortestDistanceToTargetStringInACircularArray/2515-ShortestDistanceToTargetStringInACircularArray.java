// Last updated: 09/09/2026, 16:08:36
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int count=0;
        int i=startIndex;
        while(count<n){
            if(words[i].equals(target)){
                break;
            }
            i=(i+1)%n;
            count++;
        }

        int count2=0;
        int j=startIndex;
        while(count2<n){
            if(words[j].equals(target)){
                break;
            }
            j=(j-1+n)%n;
            count2++;
        }

        int ans=Math.min(count,count2);
        if(ans==n) return -1;
        return ans;
    }
}