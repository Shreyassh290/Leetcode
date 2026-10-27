class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       List<Integer> l=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(h.contains(nums[i])){
          l.add(nums[i]);
        }
        else{
            h.add(nums[i]);
        }
       }
       if(l.size()==0){
        return 0;
       } 
       int ans=0;
       for(int i=0;i<l.size();i++){
       ans=ans^l.get(i);
       }
       return ans;
    }
}