// Last updated: 01/10/2025, 17:50:06
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