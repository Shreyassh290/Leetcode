class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int idx=h.get(nums[i]);
                if(Math.abs(i-idx)<=k){
                    return true;
                }
                else{
                    h.put(nums[i],i);
                }
            }
            else{
                h.put(nums[i],i);
            }
        }
        return false;
    }
}