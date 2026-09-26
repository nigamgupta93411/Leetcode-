class Solution {
    public int heightChecker(int[] heights) {
        int[] expected =heights.clone();
        int n=heights.length;
        int count=0;
        Arrays.sort(expected);
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
      return count;
        
    }
}