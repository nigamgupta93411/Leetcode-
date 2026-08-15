class Solution {
    public int maxProduct(int[] nums) {
        int maxi=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=(nums[l]-1)*(nums[r]-1);
            maxi=Math.max(maxi,sum);
            if(nums[l]<=nums[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxi;
        
    }
}