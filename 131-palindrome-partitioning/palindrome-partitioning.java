class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list2=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        part(s,0,list,list2);
        return list2;
        
    }
    public static void part(String s,int ind,ArrayList<String> list,List<List<String>> list2){
        if(ind>=s.length()){
            list2.add(new ArrayList<>(list));
            return ;
        }
        for(int  i=ind;i<s.length();i++){
        if(ispal(s,ind,i)){
            list.add(s.substring(ind,i+1));
            part(s,i+1,list,list2);
            list.remove(list.size()-1);
        }
        }
    }
    public static boolean ispal(String s,int ind,int i){
        int st=ind;
        int en=i;
        while(st<=en){
            if(s.charAt(st)!=s.charAt(en))
            return false;
            st++;
            en--;
        }
        return true;
    }
}