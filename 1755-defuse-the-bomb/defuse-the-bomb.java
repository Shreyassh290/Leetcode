class Solution {
    static int[] pos(int []arr,int k){
        int n=arr.length;
        int ans[]=new int[n];
        int val=0;
        for(int i=1;i<k+1;i++){
         val+=arr[i%n];
        }
        ans[0]=val;
        for(int i=1;i<n;i++){
          val=val-arr[i]+arr[(i+k)%n];
          ans[i]=val;
        }
        return ans;
    }
    static int[] neg(int []arr,int k){
        int n=arr.length;
        int ans[]=new int[n];
        int val=0;
        for(int i=0;i<k;i++){
         val+=arr[n-1-i];
        }
        ans[0]=val;
        for(int i=1;i<n;i++){
         val = val - arr[(n - k + i - 1) % n]+ arr[i - 1];
          ans[i]=val;
        }
        return ans;
    }
    public int[] decrypt(int[] code, int k) {
       if(k==0){
        Arrays.fill(code,0);
        return code;
       }
       if(k>0){
        code=pos(code,k);
       }
       else{
        k=k*-1;
        code=neg(code,k);
       }
       return code;
    }
}