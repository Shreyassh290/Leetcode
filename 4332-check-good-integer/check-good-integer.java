class Solution {
    public boolean checkGoodInteger(int n) {
        int digit;
        int d=n;
        int c=0;
        while(d!=0){
         d=d/10;
         c++;
        }
        int arr[]=new int[c];
        d=n;
        int i=0;
        while(d!=0){
            int r=d%10;
            arr[i]=r;
            i++;
            d=d/10;
        }
        int ds=0,ss=0;
        for(i=0;i<c;i++){
            ds+=arr[i];
            ss+=(int)Math.pow(arr[i],2);
        }
        int df=ss-ds;
        if(df>=50) return true;
        return false;
    }
}