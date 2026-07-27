class Solution {
    public int gcdOfOddEvenSums(int n) {
        int m=n*n;
        int s=n*n+n;
        int min=Math.max(m,s);
        int max=Math.max(m,s);
        int gcd=1;
        for(int i=min;i>=0;i--){
            if(m%i==0 && n%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}