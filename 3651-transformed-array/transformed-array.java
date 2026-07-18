class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r[i]=0;
            }
            else{
                int idx=((i+nums[i]%n)+n)%n;
                r[i]=nums[idx];
            }
        }
        return r;
    }
}