class Solution {
    public int mostFrequentEven(int[] nums) {
      int ans=-1;
      int maxcount=Integer.MIN_VALUE;
      int c=0;
      int v;
      Arrays.sort(nums);
      int n=nums.length;
      for(int i=0;i<n;i++){
        c=0;
        if(nums[i]%2==0){
            v=nums[i];
            while(i<n && nums[i]==v){
                c++;
                i++;
                 
            }
            i--;
            if(maxcount==c){
                ans=Math.min(ans,v);
            }
            else if(c>maxcount){
                ans=v;
                maxcount=c;
            }
            else{

            }
        }
       
      }
      return ans;  
    }
}