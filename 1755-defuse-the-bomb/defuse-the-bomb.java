class Solution {
    public int[] decrypt(int[] code, int k) {
    int n=code.length;
    int[] rr= new int[n];
    if(k==0){
        return rr;
    } 
    for(int i=0;i<n;i++){
        if(k>0){
        for(int j=i+1;j<i+1+k;j++){
            rr[i]=rr[i]+code[j%n];
        }
        }
        else if(k<0){
            for(int j=i-1;j>i-1-Math.abs(k);j--){
                rr[i]=rr[i]+code[((j%n)+n)%n];

            }
        }
    }
    return rr;

        
    }
}