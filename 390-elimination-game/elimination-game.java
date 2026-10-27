class Solution {
    public int lastRemaining(int n) {
        return solve(1,n,1,true);
        
    }
    public static int solve(int head,int rem ,int jump,boolean dire_left){
        if(rem==1){
            return head;
        }
        if(rem%2!=0 || dire_left==true){
            head=head+jump;
        }
        rem=rem/2;
        jump=jump*2;
       return  solve(head,rem,jump,!dire_left);
       
    }
    
}