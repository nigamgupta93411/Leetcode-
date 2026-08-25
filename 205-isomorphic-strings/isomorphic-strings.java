class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map=new HashMap<>();
       HashMap<Character,Character> map2=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ss=s.charAt(i);
        char tt=t.charAt(i);
        if(map.containsKey(ss) && map.get(ss)!=tt){
            return false;
        }  
        if(map2.containsKey(tt) && map2.get(tt)!=ss){
            return false;
                }
                        map.put(ss,tt);
                        map2.put(tt,ss);
             }
             return true;
    }
}