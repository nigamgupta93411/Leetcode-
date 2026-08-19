class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int x=Integer.MAX_VALUE;
        int droneno=-1;
        for(int i=0;i<drones.length;i++){
            int md=0;
            for(int j=0;j<target.length;j++){
            md+=Math.abs(drones[i][j]-target[j]);
         
          }
          if(md<=drones[i][2]&& md<x){
          x=Math.min(x,md);
            droneno=i;
        }
        }
        return droneno;
    }
}