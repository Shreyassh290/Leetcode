class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        while(n>0){
            int val=n%10;
            n=n/10;
            h.put(val,h.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(var i: h.entrySet()){
            int k=i.getKey();
            int v=i.getValue();
            int ans1=k*v;
            ans+=ans1;
        }
        return ans;
    }
}