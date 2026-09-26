class Solution {
    public int pivotIndex(int[] nums) {
        int[] presum=new int[nums.length];
        int n=nums.length;
        presum[0]=nums[0];
        for(int i=1;i<n;i++){
          presum[i]=presum[i-1]+nums[i];  
        }
        for(int i=0;i<n;i++){
            if(presum[i]-nums[i]==presum[n-1]-presum[i]){
                return i;
            }
        }
        return -1;

        
    }
}