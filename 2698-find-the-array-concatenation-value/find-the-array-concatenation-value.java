class Solution {
    static int digit(int val){
        int num = val;
        int digits = (num == 0) ? 1 : (int)Math.log10(Math.abs(num)) + 1;
        return digits;
    }
    public long findTheArrayConcVal(int[] nums) {
      int n=nums.length;
      int left=0;
      int right=n-1;
      long ans=0;
      while(left<right){
       int val1=nums[left];
       int val2=nums[right];
       int d=digit(val2);
       ans+=(long)Math.pow(10,d)*val1+val2;
       left++;
       right--;
      }
      if(n%2!=0){
        ans+=nums[n/2];
      }
      return ans;
    }
}