class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
             h.add(nums[i]);
        }
        for(int i=1;i<=n+1;i++){
            if(!h.contains(i)){
                return i;
            }
        }
        return 1;
    }
}