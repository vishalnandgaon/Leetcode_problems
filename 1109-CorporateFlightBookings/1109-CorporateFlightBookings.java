// Last updated: 09/09/2026, 16:21:10
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];

        for(int[] booking:bookings){
            ans[booking[0]-1]+=booking[2];
            if(booking[1]<=n-1){
                ans[booking[1]]-=booking[2];
            }
        }
        for(int i=1;i<n;i++){
            ans[i]=ans[i]+ans[i-1];
        } 
        return ans;  
    }
}