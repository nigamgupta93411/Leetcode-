class Solution {
    public int maxScore(String s) {
        int maxsum=0;
        int totalones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                totalones++;
            }
        }
        int currzero=0;
        for(int i=0;i<s.length()-1;i++){
       if(s.charAt(i)=='0'){
        currzero++;
       }else{
        totalones--;
       }
       int sum=currzero+totalones;
       maxsum=Math.max(maxsum,sum);
        }

        return maxsum;
    }
}