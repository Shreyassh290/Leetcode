class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int c=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
              c++;
            }
            if(nums[i]==pivot){
                count++;
            }
        }
        right=c+count;
        for(int i=c;i<c+count;i++){
            ans[i]=pivot;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]!=pivot && nums[i]<pivot){
                ans[left++]=nums[i];
            }
            if(nums[i]!=pivot && nums[i]>pivot){
                ans[right++]=nums[i];
            }
        }
      return ans;
    }
}