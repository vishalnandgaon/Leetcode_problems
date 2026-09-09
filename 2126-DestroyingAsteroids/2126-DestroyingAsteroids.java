// Last updated: 09/09/2026, 16:11:16
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentmass = mass;
        for(int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] > currentmass) return false;
            currentmass += asteroids[i];
        }
        return true;
    }
}