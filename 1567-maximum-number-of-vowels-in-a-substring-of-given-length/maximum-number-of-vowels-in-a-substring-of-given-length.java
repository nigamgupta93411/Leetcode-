class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
          for(int x=k;x<n;x++){
                if(isVowel(s.charAt(x-k))){
                    count--;
                }
                
                if(isVowel(s.charAt(x))){
                    count++;
                }
                 max=Math.max(count,max);
            }
    

        
        return max;

        
    }
      public boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u';
}
}