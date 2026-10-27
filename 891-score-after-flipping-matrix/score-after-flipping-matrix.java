class Solution {
    static void flip(int [][]arr,int row){
      int m=arr[0].length;
      for(int j=0;j<m;j++){
        if(arr[row][j]==1){
            arr[row][j]=0;
        }
        else{
            arr[row][j]=1;
        }
      }
    }
    public int matrixScore(int[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
      for(int i=0;i<n;i++){
        if(grid[i][0]==0){
            flip(grid,i);
        }
      }  
      int colsum[]=new int[m];
      for(int j=0;j<m;j++){
        for(int i=0;i<n;i++){
          if(grid[i][j]==1){
            colsum[j]++;
          }
        }
      }
      for(int j=0;j<m;j++){
        if(colsum[j]<=n/2){
            colsum[j]=n-colsum[j];
        }
      }
      int ans=0;
      int k=0;
      for(int j=m-1;j>=0;j--){
       ans+=colsum[j]*(1<<k);
       k++;
      }
      return ans;
    }
}