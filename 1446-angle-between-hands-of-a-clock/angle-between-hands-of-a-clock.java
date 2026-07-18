class Solution {
    public double angleClock(int hour, int minutes) {
        double r=Math.abs(hour*30-minutes*5.5);
        double ans=Math.abs(Math.min(r,360-r));
        return ans;
    }
}