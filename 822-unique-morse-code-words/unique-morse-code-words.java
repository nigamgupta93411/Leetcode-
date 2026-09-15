class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
    HashSet<String> set=new HashSet<>();
    for(String word:words ){
        String cc="";
        for(int j=0;j<word.length();j++){
        char ch=word.charAt(j);
        cc+=morse[ch-'a'];
        }
        set.add(cc);
    }
    return set.size();
        
    }
}