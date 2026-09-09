// Last updated: 09/09/2026, 15:55:42
class Solution {
    public double[] internalAngles(int[] sides) {
        int a=sides[0];
        int b=sides[1];
        int c=sides[2];
        if(a+b<=c || b+c<=a || c+a<=b){
            return new double[]{};
        }

        double[] angles=new double[3];
        angles[0]=Math.toDegrees(Math.acos((double)(b*b+c*c-a*a)/(2*b*c)));
        angles[1]=Math.toDegrees(Math.acos((double)(c*c+a*a-b*b)/(2*a*c)));
        angles[2]=Math.toDegrees(Math.acos((double)(b*b-c*c+a*a)/(2*b*a)));
        Arrays.sort(angles);
        return angles;
    }
}