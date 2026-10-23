class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> list2=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       fun(nums,list,list2,map);
       return list2;
        
    }
    public static void fun(int[] arr,ArrayList<Integer> list,List<List<Integer>> list2,HashMap<Integer,Integer> map){
    if(list.size()==arr.length){
        list2.add(new ArrayList<>(list));
        return ;
    }
    for(int key:map.keySet()){
        int count=map.get(key);
        if(count==0) continue;
        list.add(key);
        map.put(key,count-1);
        fun(arr,list,list2,map);
        list.remove(list.size()-1);
        map.put(key,count);
    }
    }
}