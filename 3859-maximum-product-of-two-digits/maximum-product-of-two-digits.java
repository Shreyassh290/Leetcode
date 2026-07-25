class Solution {
    public int maxProduct(int n) {
       int m=(int)Math.log10(Math.abs(n))+1;  
       int arr[]=new int[m];
       for(int i=0;i<m;i++){
        arr[i]=n%10;
        n=n/10;
       }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<m-1;i++){
        for(int j=i+1;j<m;j++){
         max=Math.max(max,arr[i]*arr[j]);
        }
       }
       return max;
    }
}