class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     int nd=numBottles;
     int ne=numBottles;
     int sum=numBottles;
     
     while(ne>=numExchange){
        nd=ne/numExchange;
        sum+=nd;
        ne=nd+(ne%numExchange);
     }   
     return sum;
    }
}