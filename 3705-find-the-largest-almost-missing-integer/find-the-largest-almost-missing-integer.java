class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int x:set){
                mpp.put(x,mpp.getOrDefault(x,0)+1);
            }

        }
        int ans=-1;
      for(int x:mpp.keySet()){
        if(mpp.get(x)==1){
            ans=Math.max(ans,x);
        }
      }
      return ans;
    }
}

        