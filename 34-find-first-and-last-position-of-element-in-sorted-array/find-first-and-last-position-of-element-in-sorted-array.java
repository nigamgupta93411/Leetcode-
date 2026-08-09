class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int lt=nums.length-1;
        int st=0;
        while(st<=lt){
            int mid=(st+lt)/2;
            if(nums[mid]==target){
                first=mid;
                lt=mid-1;
            }
            else if(nums[mid]>target){
                lt=mid-1;
            }else {
                st=mid+1;
            }
          
               }
            int last=-1;
            int l=0;
            int r=nums.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]==target){
                    last=mid;
                    l=mid+1;
                }
                else if(nums[mid]>target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
                
            }
            return new int[]{first, last};


        }
        
    }
