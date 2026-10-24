class Solution {
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> list2=new ArrayList<>();
     char[][] chess=new char[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            chess[i][j]='.';
        }
     }
     int N=n;
     recur(chess,0,N,list2);
     return list2;
    }
    public static void recur(char [][] chess,int row,int N,List<List<String>> list2){
        if(row>=N){
     ArrayList<String> list=new ArrayList<>();
           for(int a=0;a<N;a++){
                list.add(new String(chess[a]));
        }
       list2.add(new ArrayList<>(list));
       return ;
        }
    for(int col=0;col<N;col++){
        if(isvalid(chess,row,col,N)){
       chess[row][col]='Q';
       recur(chess,row+1,N,list2);
       chess[row][col]='.';
        }
    }
    }
    public static boolean isvalid(char[][] chess,int row,int col,int N){
        // checking straight
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q')
                return false;
        }
        // checkin diag left side
        for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--){
            if(chess[i][j]=='Q') return false;
        }
        // checking diag right side
        for(int i=row-1,j=col+1;i>=0&& j<N;i--,j++){
            if(chess[i][j]=='Q') return false;
        }
        return true;
    }

        
    }
