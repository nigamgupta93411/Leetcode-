class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        char[] arr=s.toCharArray();
        int l=0;
        int h=0;

        for( ;h<arr.length;h++){
            char ch=arr[h];
            if(map.containsKey(ch)){
              l = Math.max(l, map.get(ch) + 1);
            }
                map.put(ch,h);
                max=Math.max(max,h-l+1);

            
        }
        return max;
        
    }
}