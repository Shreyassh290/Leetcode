class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int ans[]=new int[2];
        int i=0;
        int j=0;
        ans[0]=-1;
        ans[1]=-1;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
            if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
             ans[0]=i;
             ans[1]=j;
             return ans;
          }
        }
        }
        return ans;
    }
}