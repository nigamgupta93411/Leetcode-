class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
         while(map.get(ch)>1){
            char cc=s.charAt(l);
            map.put(cc,map.getOrDefault(cc,0)-1);
         if(map.get(cc)==0)
            map.remove(cc);
        
         
         l++;
         }
         max=Math.max(max,r-l+1);
        }
        return max;

         }
        }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // HashMap<Character,Integer> map=new HashMap<>();
        // int max=0;
        // char[] arr=s.toCharArray();
        // int l=0;
        // int h=0;

        // for( ;h<arr.length;h++){
        //     char ch=arr[h];
        //     if(map.containsKey(ch)){
        //       l = Math.max(l, map.get(ch) + 1);
        //     }
        //         map.put(ch,h);
        //         max=Math.max(max,h-l+1);

            
        // }
        // return max;
        
//     }
// }