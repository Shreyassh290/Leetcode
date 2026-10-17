class Solution {
    static boolean isSafe(char board[][],int row ,int col,int val){
        int n=board.length;
        for(int j=0;j<n;j++){
         int v=board[row][j]-'0';
         if(v==val) return false;
        }
        for(int i=0;i<n;i++){
            int v=board[i][col]-'0';
            if(v==val) return false;
            
        }
        int r1=row%3;
        int c1=col%3;
        System.out.println(val);
        for(int i=row-r1;i<row-r1+3;i++){
            for(int j=col-c1;j<col-c1+3;j++){
                if(board[i][j]!='.'){
                int v1=board[i][j]-'0';
                System.out.print(v1+" ");
                if(v1==val) return false;
                }
            }
             System.out.println();
        }
        return true;
    }
    static boolean find(char board[][]){
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                int val=board[i][j]-'0';
                board[i][j]='.';
                if(!isSafe(board,i,j,val)){
                    return false;
                }
                board[i][j]=(char)(val+'0');
                }
                
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return find(board);
    }
}