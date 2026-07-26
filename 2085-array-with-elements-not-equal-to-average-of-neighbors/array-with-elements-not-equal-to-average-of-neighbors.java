class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int l=(n-1)/2;
        int r=n-1;
        Arrays.sort(nums);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=nums[l--];
            }
            else{
                arr[i]=nums[r--];
            }
        }
        return arr;
    }
}