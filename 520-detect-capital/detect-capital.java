class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
        if(ch>='A' && ch<='Z'){
            uppercase++;
        }
        }
        if(uppercase==word.length()){
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0)) && uppercase==1){
            return true;
        }
        else if(uppercase==0){
            return true;
        }
        return false;
        
    }
}