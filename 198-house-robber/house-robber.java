class Solution {
    public int rob(int[] nums) {
        int i=0;
        int prev1=0;
        int prev2=0;
        while(i<nums.length){
            int curr=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=curr;
            i++;
        }
        return prev1;
        
    }
}