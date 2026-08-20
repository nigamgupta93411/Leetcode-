class Solution {
    public int threeSumClosest(int[] nums, int target) {

        //int s=0;
        //int l=nums.length;
        int ans=nums[0]+nums[1]+nums[2];
        int sum3=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
        sum3=nums[i]+nums[left]+nums[right];
            if(Math.abs(sum3-target)<Math.abs(ans-target)){
                ans=sum3;}
                if(sum3<target){
                    left++;
                }
                else if(sum3>target){
                    right--;
                }else{
                    return sum3;
                
                }
                }
        }
             
            return ans;
        }
    }
