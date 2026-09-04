class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int j=0;j<k;j++){
        int max=0;
        int maxkey=-1;
        for(int key:map.keySet()){
         if(map.get(key)>max){
            max=map.get(key);
            maxkey=key;
         }
        }
        ans[j]=maxkey;
        map.remove(maxkey);
            }
            return ans;
    }
        }

        