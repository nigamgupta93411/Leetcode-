class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int j:nums2){
            set2.add(j);
        }
        for(int i:set1){
            if(!set2.contains(i)){
                ans1.add(i);
            }
        }
        for(int x:set2){
            if(!set1.contains(x)){
                ans2.add(x);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;

    }
}