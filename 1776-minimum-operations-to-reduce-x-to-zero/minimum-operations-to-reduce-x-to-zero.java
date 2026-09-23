class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int totals=0;
        for(int num:nums){
            totals+=num;
        }
        int target=totals-x;
        if(target==0){
            return n;
        }
        if(target<0){
            return -1;
        }
         int left=0;
        int curr=0;
        int maxl=-1;
        for(int right=0;right<n;right++){
            curr+=nums[right];
            while(curr>target && left<right){
                curr-=nums[left];
                left++;
            }
            if(curr==target){
            maxl=Math.max(maxl,right-left+1);
            }
        }
        if(maxl==-1){
            return -1;
        }
        else
        
        return n-maxl;
        
    }
}