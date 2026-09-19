class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(var i:h.entrySet()){
            int v=i.getValue();
            if(v>max){
                max=v;
            }
        }
        int c=0;
        for(var i:h.entrySet()){
            int v=i.getValue();
            if(v==max){
                c++;
            }
        }
        return c*max;
    }
}