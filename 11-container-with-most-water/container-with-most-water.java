class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int left=0;
        int right=h.length-1;
        while(left<=right){
            int w=right-left;
            int area=Math.min(h[left],h[right])*w;
            max=Math.max(max,area);
        
        if(h[left]<h[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return max;
        
    }
}