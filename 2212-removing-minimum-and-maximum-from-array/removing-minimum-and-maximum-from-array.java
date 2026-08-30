class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int del1=0,del2=0;
        int ans1=0;
        int ans2=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
          max=nums[i];
          del1=i;
        }
        if(nums[i]<min){
            min=nums[i];
            del2=i;
        }
      }
      int left=Math.min(del1,del2);
      int right=Math.max(del1,del2);
        ans1=nums.length-left;
        ans2=right+1;
        int ans3=left+1+(nums.length-right);
      return Math.min(ans1,Math.min(ans2,ans3));
        
    }
}