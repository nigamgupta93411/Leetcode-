class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        int j=0;
        
        if(arr1.length==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            boolean mila=false;
            for(;j<t.length();j++){
              if(arr1[i]==arr2[j]){
                mila=true;
                j++;
                break;
              }
            }
        
        if(mila==false)
            return false;
      }
      return true;
          }
}