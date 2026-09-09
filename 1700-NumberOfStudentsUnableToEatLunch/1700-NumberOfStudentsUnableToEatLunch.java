// Last updated: 09/09/2026, 16:15:48
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0;
        int zeros=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0) zeros++;
            else ones++;
        }

        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && zeros>0){
                zeros--;
            }
            else if(sandwiches[i]==1 && ones>0){
                ones--;
            }
            else{
                break;
            }
        }
        return ones+zeros;
    }
}