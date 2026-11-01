class Solution {
    public int largestAltitude(int[] gain) {
        int peak=0;
        int sum=0;

        for(int i=0;i<gain.length;i++){
       sum+=gain[i];
       peak=Math.max(peak,sum);
        }
        return peak;
        
    }
}