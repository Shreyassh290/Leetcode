class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
     int n=timeSeries.length;
     int e[]=new int[n];
     int c=0;
     for(int i=0;i<n;i++){
        e[i]=timeSeries[i]+duration;
        System.out.print(e[i]-1+" ");
     }
     c+=duration;
     for(int i=1;i<n;i++){
      if(e[i-1]-1>=timeSeries[i]){
        int d=e[i-1]-timeSeries[i];
        if(d==0){
            c+=duration-1;
        }
        else{
            c+=duration-d;
        }
      }
      else{
        c+=duration;
      }
     }
     return c;
    }
}