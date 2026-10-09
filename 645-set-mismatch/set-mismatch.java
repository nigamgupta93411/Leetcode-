class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int dupli=0;
        int missed=0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                dupli=nums[i];
            }
            set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                missed=i;
                break;
            }
        }
        return new int[]{dupli,missed};
    }
}