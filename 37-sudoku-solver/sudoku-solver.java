class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
    public static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
          for(int j=0;j<9;j++){
            if(board[i][j]=='.'){
                for(char a='1';a<='9';a++){
                    if(isvalid(board,a,i,j)){
                        board[i][j]=a;
                        if(solve(board)==true){
                        return true;
                        }
                        board[i][j]='.';
                    }
                }
                return false;
            }
        
          }
        }
        return true;
    }
    public static boolean isvalid(char[][] board,char a,int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==a) return false;
        }
        for(int j=0;j<9;j++){
            if(board[j][col]==a) return false;
        }
        int st=row/3*3;
        int en=col/3*3;
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(board[st+k][en+l]==a)
                return false;
            }
        }
        return true;
    }
}