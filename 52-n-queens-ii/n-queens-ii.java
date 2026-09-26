class Solution {
    static int c=0;
     static boolean isSafe(char board[][],int row,int col){
     int n=board.length;
     for(int j=0;j<n;j++){
        if(board[row][j]=='Q') return false;
     }
     for(int i=0;i<n;i++){
        if(board[i][col]=='Q') return false;
     }
     int i=row-1;
     int j=col+1;
     while(i>=0 && j<n){
       if(board[i][j]=='Q') return false;
       i--;
       j++;
     }
     i=row-1;
     j=col-1;
     while(i>=0 && j>=0){
       if(board[i][j]=='Q') return false;
       i--;
       j--;
     }
     i=row+1;
     j=col+1;
     while(i<n && j<n){
       if(board[i][j]=='Q') return false;
       i++;
       j++;
     }
     i=row+1;
     j=col-1;
     while(i<n && j>=0){
       if(board[i][j]=='Q') return false;
       i++;
       j--;
     }
     return true;
    }
    static void find(char[][] board,int row){
        int n=board.length;
        if(row==n){
            c++;
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                find(board,row+1);
                board[row][j]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        c=0;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        find(board,0);
        return c;
    }
}