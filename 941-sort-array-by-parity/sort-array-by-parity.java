class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            if(nums[l]%2!=0 && nums[r]%2==0){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r--;
            }
            else if(nums[l]%2!=0 && nums[r]%2!=0){
                r--;
            }
             else if(nums[l]%2==0 && nums[r]%2==0){
                l++;
            }
            else{
                l++;
                r--;
            }
        }
        return nums;
    }
}