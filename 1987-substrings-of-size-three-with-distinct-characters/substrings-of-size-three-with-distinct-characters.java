class Solution {
    public int countGoodSubstrings(String s) {
        // int count=0;
        // for(int i=0;i<s.length()-2;i++){
        //  char ch=s.charAt(i);
        //  if(ch!=s.charAt(i+1)&&
        //  s.charAt(i+1)!=s.charAt(i+2)&&
        //  ch!=s.charAt(i+2)){
        //     count++;
        //  }
        // }
        // return count;
        int count=0;
        for(int i=0;i<s.length()-2;i++){
       HashMap<Character,Integer> map=new HashMap<>();
       for(int j=i;j<i+3;j++){
       char ch=s.charAt(j);
       if(map.containsKey(ch)){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }else{
        map.put(ch,0);
       }
               }
               if(map.size()==3){
          count++;
               }
        }
        return count;

        
    }
}