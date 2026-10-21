class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> list2=new ArrayList<>();
        fun(nums,0,list,list2);
        return list2;
        
    }
    public static void fun(int[] arr,int ind, ArrayList<Integer> list, List<List<Integer>> list2 ){
        if(ind==arr.length){
            list2.add(new ArrayList<>(list));
            return ;
        }
        list.add(arr[ind]);
        fun(arr,ind+1,list,list2);
        list.remove(list.size()-1);
        fun(arr,ind+1,list,list2);
    }
}