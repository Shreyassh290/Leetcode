class Solution {
    static boolean check(int n,int d,int t){
        int mul=1;
        for(int i=0;i<d;i++){
          int r=n%10;
          n=n/10;
          mul=mul*r;
        }
        if(mul%t==0){
            return true;
        }
        return false;
    }
    public int smallestNumber(int n, int t) {
        int m=n;
        int digit;
        if(n==0){
         digit=1;
        }
        else{
         digit=(int)Math.log10(Math.abs(n))+1;
        }
        while(true){
            if(check(m,digit,t)){
                return m;
            }
            m++;
        }
    }
}