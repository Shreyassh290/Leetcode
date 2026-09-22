class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int ans=-1;
        for(var i: h.entrySet()){
            int key=i.getKey();
            int value=i.getValue();
            if(key%2==0 && value==1){
             ans=key;
             break; 
            }
        }
        return ans;
    }
}