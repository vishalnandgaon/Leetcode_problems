// Last updated: 09/09/2026, 15:55:27
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0) return "Green";
        else if(timer==30) return "Orange";
        else if(timer>30 && timer<=90) return "Red";
        return "Invalid";
    }
}