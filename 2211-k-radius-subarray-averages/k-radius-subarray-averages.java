class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        long sum=0;
        int index=2*k+1;
        if(index>n){
            return ans;
        }
        for(int i=0;i<index;i++){
            sum+=nums[i];
        }
            ans[k]=(int)(sum/index);
        
        for(int j=index;j<n;j++){
            sum+=nums[j];
            sum=sum-nums[j-index];
            ans[++k]=(int)(sum/index);
        }
        return ans;

        
    }
}