class Solution {
    public int maxIceCream(int[] costs, int coins) {
      int n=costs.length;
      int c=0;
      Arrays.sort(costs);
      for(int i=0;i<n;i++){
        if(coins-costs[i]>=0){
            coins-=costs[i];
            c++;
        }
      }
      return c; 
    }
}