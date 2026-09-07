class Solution {
    public int countGoodSubstrings(String s) {
        //HashMap<Character,int> Map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length()-2;i++){
         char ch=s.charAt(i);
         if(ch!=s.charAt(i+1)&&
         s.charAt(i+1)!=s.charAt(i+2)&&
         ch!=s.charAt(i+2)){
            count++;
         }
        }
        return count;
        

        
    }
}