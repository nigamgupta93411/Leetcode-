class Solution {
    public int minStartValue(int[] nums) {
        int minSum=nums[0];
        int[] presum=new int[nums.length];
        presum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            presum[i]=presum[i-1]+nums[i];
        minSum=Math.min(minSum,presum[i]);
       
        }
        
     return Math.max(1,1-minSum);

        
    }
}