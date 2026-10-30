class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
       int left=0;
       int n=arr.length;
       int right=n-1;
       while(left<=right){
        if(((right-left)+1)%2!=0){
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        }
       
        right--;
        if(right<left){
            right=n-1;
            left++;
        }
       }
       
       return sum;
    }
}