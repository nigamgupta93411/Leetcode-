class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);

    }
    public static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!isvalid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(char[][] board,int row,int col){
        
        for(int i=0;i<9;i++){
            if( i!=row && board[i][col]==board[row][col]) return false;
        }
    
        for(int j=0;j<9;j++){
            if(j!= col && board[row][j]==board[row][col]) return false;
        }
        int st=row/3*3;
        int end=col/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if( st+i!= row && end+j!=col && board[st+i][end+j]==board[row][col])
                return false;
            }
        }
        return true;
    }
}