class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
          String target=words[i];
          for(int j=0;j<words.length;j++){
            String s=words[j];
            if(s.contains(target)&& i!=j){
           list.add(target);
           break;
            }

          } 
        }
        return list;
        
    }
}