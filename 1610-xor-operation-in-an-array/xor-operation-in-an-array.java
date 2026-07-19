class Solution {
    public int xorOperation(int n, int start) {
      int[] arr=new int[n];
      int m=0;
      int r=0;
      for(int i=0;i<n;i++){
       arr[i]=start+2*i;
      }  
      m=arr[0];
      for(int i=1;i<n;i++){
        m=m^arr[i];
      }
      return m;
    }
}