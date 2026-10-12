class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=0;
        int n=nums.length;
        int h=n-1;
        while(l<h){
      if(nums[l]+nums[h]==target){
        list.add(l+1);
        list.add(h+1);

      }
      if(nums[l]+nums[h]>target){
        h--;
      }else{
        l++;
      }
        }
    int[] arr=new int[list.size()];
    for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
        return arr;
    }
}