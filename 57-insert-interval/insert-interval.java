class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int j=0;
        int res[][]=new int[n+1][2];
        for(int i=0;i<n;i++){
            res[i][0]=intervals[i][0];
            res[i][1]=intervals[i][1];
        }
        res[n][0]=newInterval[0];
        res[n][1]=newInterval[1];
        Arrays.sort(res,(a,b)-> a[0]-b[0]);
        for(int i=1;i<=n;i++){
            if(res[i][0]<=res[i-1][1]){
                res[i][0]=Math.min(res[i][0],res[i-1][0]);
                res[i][1]=Math.max(res[i][1],res[i-1][1]);
                j++;
                res[i-1][0]=-1;
            }
            
        }
        int arr[][]=new int[n+1-j][2];
        j=0;
        int i=0;
        while(i<=n){
            if(res[i][0]!=-1){
                arr[j][0]=res[i][0];
                arr[j][1]=res[i][1];
                j++;
            }
            i++;
        }
        return arr;
    }
}