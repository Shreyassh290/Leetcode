class Solution {
    public int deleteGreatestValue(int[][] nums) {
       int n=nums.length;
       int m=nums[0].length;
       int ans=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        Arrays.sort(nums[i]);
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            max=Math.max(max,nums[j][i]);
        }
        ans+=max;
       }
       return ans;
    }
}