class Solution {
    public double myPow(double x, int n) {
        long a=Math.abs((long)n);
   double ans=fun(x,a);
   return n<0? 1/ans: ans;
    }
    public static double fun(double x,long n){
        if(n==0){
            return 1;
        }
        double half=fun(x,n/2);
        double result=half*half;
        if(n%2!=0){
            result=x*result;
        }
        return result;
    }
}