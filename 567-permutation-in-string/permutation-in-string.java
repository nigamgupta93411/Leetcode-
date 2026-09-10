class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        HashMap<Character,Integer> map=new HashMap<>();
        if(n>s2.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int left=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
         if(map2.containsKey(ch)){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            else{
                map2.put(ch,1);
            }
        if(right-left+1== n){
            if(map.equals(map2)){
                return true;

            }
            char cc=s2.charAt(left);
            if(map2.get(cc)==1){
                    map2.remove(cc);
                }
                else{
                    map2.put(cc,map2.get(cc)-1);
                }
            left++;
        }
        }
        return false;
        
    }
        
        
}