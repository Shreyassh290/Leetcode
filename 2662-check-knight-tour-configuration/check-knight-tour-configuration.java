class Solution {
    static int i=0;
    static int j=0;
    static boolean isSafe(int board[][],int row,int col,int count){
        int n=board.length;
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]==count+1){
            return true;
        }
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j]==count+1){
            return true;
        }
        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]==count+1){
            return true;
        }
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]==count+1){
            return true;
        }
        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]==count+1){
            return true;
        }
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]==count+1){
            return true;
        }
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]==count+1){
            return true;
        }
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]==count+1){
            return true;
        }
        return false;
        
    }
    static boolean find(int board[][],int row,int col,int count){
        int n=board.length;
        if(count==n*n-1){
            return true;
        }
        if(!isSafe(board,row,col,count)) return false;
        return find(board,i,j,count+1);
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        i=0;
        j=0;
        return find(grid,i,j,0);
    }
}