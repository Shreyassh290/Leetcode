class Solution {
    public boolean hasAlternatingBits(int n) {
     int v=n^(n>>1);
     return ((v&(v+1))==0);   
    }
}