class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ind=-1;
        for(int j=1; ;j++){
            boolean check=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k*j){
                check=true;
                break;
            }
        }
            if(!check){
            return j*k;
              }
        }
         }
}
    