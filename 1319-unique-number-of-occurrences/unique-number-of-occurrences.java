class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        boolean diffreq=true;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(set.contains(map.get(key))){
          diffreq=false;
            }else{
                set.add(map.get(key));
            }
        }
        if(diffreq==true){
            return true;
        }
        else
            return false;
        
    }
}