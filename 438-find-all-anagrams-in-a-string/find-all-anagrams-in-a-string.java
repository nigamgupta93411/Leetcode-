class Solution {
    public List<Integer> findAnagrams(String s, String p) {
   int n=p.length();
   ArrayList<Integer> list=new ArrayList<>();
   HashMap<Character,Integer> map=new HashMap<>();
   for(int i=0;i<n;i++){
    char ch=p.charAt(i);
 if(map.containsKey(p.charAt(i))){
    map.put(ch,map.getOrDefault(ch,0)+1);
 }
 else{
    map.put(ch,1);
 }
   }
   int left=0;
   HashMap<Character,Integer> map2=new HashMap<>();
   for(int right=0;right<s.length();right++){
     char ch=s.charAt(right);
 if(map2.containsKey(s.charAt(right))){
    map2.put(ch,map2.getOrDefault(ch,0)+1);
 }
 else{
    map2.put(ch,1);
    
   }
   if(right-left+1==n){
    if(map.equals(map2)){
        list.add(left);
    }
    char rr=s.charAt(left);
    if(map2.get(rr)==1){
        map2.remove(rr);
    }
    else{
    map2.put(rr,map2.get(rr)-1);
    }
    left++;
   
   }

        
    }
    return list;
    }
}