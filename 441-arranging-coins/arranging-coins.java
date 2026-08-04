class Solution {
    public int arrangeCoins(int n) {
       int c=0;
       int n1=1;
       while((n-n1)>=0){
        n-=n1;
        c++;
        n1++;
       } 
       return c;
    }
}