class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        int[] count=new int[26];
        for(char x:s.toCharArray()){
            count[x-'a']++;
        }
        for(char y:t.toCharArray()){
            count[y-'a']--;
        }
        for(char i:t.toCharArray()){
            if(count[i-'a']<0){
                ans=i;
            }
        }
        return ans;
    }
}