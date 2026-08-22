class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int Sum=0;
        int x=n;
        while(n>0){
            sum+=n%10;
            pro=pro*(n%10);
            n=n/10;
        }
        Sum=sum+pro;
        if(x%Sum==0){
            return true;
        }else{
            return false;
        }
        
    }
}