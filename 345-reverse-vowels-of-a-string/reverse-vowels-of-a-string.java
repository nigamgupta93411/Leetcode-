class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int r=s.length()-1;
        int l=0;
        while(l<=r){
         if(!isvowel(sb.charAt(l))){
            l++;
         }
         else if(!isvowel(sb.charAt(r))){
            r--;
         }else{
            char temp=sb.charAt(r);
            sb.setCharAt(r,s.charAt(l));
            sb.setCharAt(l,temp);
            l++;
            r--;
        
         }
        }
        return sb.toString();
        
        
    }
    public  boolean isvowel(char ch){
        return ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}