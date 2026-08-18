class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int a=(n*(n+1))/2;
        int a1;
        int a2;
        int m=n/2;
        while(m!=n){
           a1=(m*(m+1))/2;
           a2=((m-1)*(m))/2;
           if(a1==a-a2){
            return m;
           }
           m++;
        }
        return -1;
    }
}