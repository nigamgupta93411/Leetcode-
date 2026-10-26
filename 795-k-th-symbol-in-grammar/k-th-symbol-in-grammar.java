class Solution {
    public int kthGrammar(int n, int k) {
    return fun(n,k);
        
    }
    public static int fun(int n,int k){
        if(n==1){
            return 0;
        }
      int half=(int)Math.pow(2,n-2);
      if(k<=half){
        return fun(n-1,k);
      }else{
      int ans=fun(n-1,k-half);
        return opposite(ans);
      }

    
    }
    public static int opposite(int n){
        if(n==0) return 1;
        else
        return 0;
    }
}