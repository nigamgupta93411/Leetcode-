class Solution {
    public int trap(int[] h) {
int left=0;
int r=h.length-1;
int leftarr=0;
int rightarr=0;
int water=0;
while(left<r){
    leftarr=Math.max(leftarr,h[left]);
    rightarr=Math.max(rightarr,h[r]);
    if(leftarr<rightarr){
        water+=leftarr-h[left];
        left++;
    }else{
        water+=rightarr-h[r];
        r--;
    }
}
    return water;
}
    }

























































//         int n=h.length;
//         int l=0; int r=n-1;
//         int lmax=0; int rmax=0;
//         int sum=0;
//         while(l<r){
//             lmax=Math.max(lmax,h[l]);
//             rmax=Math.max(rmax,h[r]);
//             if(lmax<rmax){
//                 sum+=lmax-h[l];
//                 l++;
//             }
//             else{
//                 sum+=rmax-h[r];
//                 r--;
//             }
//         }
//         return sum;
        
//     }
// }