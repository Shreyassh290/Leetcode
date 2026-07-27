class Solution {
    public int minimumOperations(int[] nums) {
      int n=nums.length;
      int c=0;
      int f=1;
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
      if (nums[i] == 0) {
        continue;
       }
       int val=nums[i];
       f=0;
       if(nums[i]!=0){
       for(int j=0;j<n;j++){
        if(nums[j]!=0){
          nums[j]-=val;
          f=1;
        }
       }
       if(f==1){
        c++;
       }
      }
      if(f==0){
        break;
      }
      }
      return c;  
    }
}