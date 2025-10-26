// Last updated: 26/10/2025, 18:00:25
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] cars=new double[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(a,b) -> Double.compare(b[0],a[0]));
        Stack<Double> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || cars[i][1]>st.peek()){
                st.push(cars[i][1]);
            }
        }
        return st.size();
    }
}