class Solution {
    public void rotate(int[] nums, int k) {
        int l=0;
        k=k%nums.length;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        int s=0;
        int e=k-1;
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
        int n=k;
        int lo=nums.length-1;
        while(n<lo){
            int temp=nums[n];
            nums[n]=nums[lo];
            nums[lo]=temp;
            n++;
            lo--;
        }
        return ;
        
        
    }
}