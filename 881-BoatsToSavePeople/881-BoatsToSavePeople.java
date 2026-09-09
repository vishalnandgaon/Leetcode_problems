// Last updated: 09/09/2026, 16:24:02
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int n=people.length-1;
        int i=0;
        int j=n;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                count++;
                j--;
                i++;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}