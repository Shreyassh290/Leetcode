class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==k){
              ans+=tickets[k];
            }
            else if(i<k){
                int min=Math.min(tickets[i],tickets[k]);
                ans+=min;
            }
            else{
                int min=Math.min(tickets[i],tickets[k]-1);
                ans+=min;
            }
        }
        return ans;
    }
}