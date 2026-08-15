class Solution {
    public int maxProfit(int[] p) {
        int maxp=0;
        int minprice=Integer.MAX_VALUE;;
        for(int i=0;i<p.length;i++){
            minprice=Math.min(minprice,p[i]);
              int  crp=p[i]-minprice;
                maxp=Math.max(crp,maxp);
            }

        
        return maxp;
        
    }
}