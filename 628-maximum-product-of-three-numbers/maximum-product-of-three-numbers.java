class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length-1;
        if(nums.length==3){
            return (nums[0]*nums[1])*nums[2];
        } 
        Arrays.sort(nums);
        int max=0;
        int ans1=nums[0]*nums[1]*nums[n];
        int ans2=nums[n]*nums[n-1]*nums[n-2];
        return Math.max(ans1,ans2);


    }
}