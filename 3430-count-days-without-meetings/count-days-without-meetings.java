class Solution {
    public int countDays(int days, int[][] intervals) {
        int n=intervals.length;
        int j=0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(int i=1;i<n;i++){
           if(intervals[i-1][1]>=intervals[i][0] ){
              j++;
              intervals[i][0]=Math.min(intervals[i-1][0],intervals[i][0]);
              intervals[i][1]=Math.max(intervals[i-1][1],intervals[i][1]);
              intervals[i-1][0]=-1;
           }
        }
        int arr[][]=new int[n-j][2];
        int i=0;
        j=0;
        while(i<n){
            if(intervals[i][0]!=-1){
                arr[j][0]=intervals[i][0];
                arr[j][1]=intervals[i][1];
                j++;
            }
            i++;
        }
        int ans=0;
        for(i=0;i<arr.length;i++){
          int dif=arr[i][1]-arr[i][0]+1;
          ans+=dif;
          System.out.println(dif);
        }
        
        return days-ans;
    }
}