class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> list1=new ArrayList<>();
        List<List<Integer>> list2=new ArrayList<>();
        Arrays.sort(candidates);
       fun(candidates,target,list1,list2,0);
       return list2;
        
    }
    public static void fun(int[] arr,int target,ArrayList<Integer> list1,List<List<Integer>> list2 ,int ind){
        if(target==0){
            list2.add(new ArrayList<>(list1));
            return;
        }
        for(int i=ind;i<arr.length;i++){
        if(i>ind && arr[i]==arr[i-1]) continue;
        if(arr[i]>target) break;
    
        list1.add(arr[i]);
        fun(arr,target-arr[i],list1,list2,i+1);
        list1.remove(list1.size()-1);
    }
    }

}