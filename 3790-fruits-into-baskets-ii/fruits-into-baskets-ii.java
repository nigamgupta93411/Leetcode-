class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0;i<fruits.length;i++){
            boolean placed=false;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    placed=true;
                    baskets[j]=-1;
                    break;
                     }
                 }
        
        if(placed==false){
            count++;
        }
        }
        return count;
    } 
    }
