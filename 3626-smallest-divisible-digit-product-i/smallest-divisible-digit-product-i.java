class Solution {
    public int smallestNumber(int n, int t) {
     //  int p=1;
     // int x=n;
      int ans=0;
        
        while(true){
           int x=n;
           int p=1;
            while(x>0){
                p*=x%10;
                x=x/10;

            }
            if(p%t==0){
             return n;
            }
            else {
                n++;
            }
        }
        
        
    }
}