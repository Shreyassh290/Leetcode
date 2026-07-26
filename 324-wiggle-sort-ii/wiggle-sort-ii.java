class Solution {
    public void wiggleSort(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      int l=(n-1)/2;
      int d=l;
      int r=n-1;
      int arr[]=new int[n];
      int c=0;
      for(int i=0;i<n;i++){
        if(i%2==0){
            arr[i]=nums[l--];
        }
        else{
            arr[i]=nums[r--];
        }
      }
      for(int i=0;i<n;i++){
        nums[i]=arr[i];
      }
    }
}