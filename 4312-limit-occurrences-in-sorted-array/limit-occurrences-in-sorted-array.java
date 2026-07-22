class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        int idx=0;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            int val=nums[i];
            c=0;
            while(i<n && nums[i]==val){
                c++;
                i++;
            }
            i--;
            for(int j=0;j<c;j++){
               if(j<k){
                ans[idx++]=val;
               }
            }
        }
        c=0;
        for(int i=0;i<n;i++){
            if(ans[i]<0){
                c++;
            }
        }
        int n1=n-c;
        c=0;
        int a[]=new int[n1];
        for(int i=0;i<n;i++){
            if(ans[i]>0)
              a[c++]=ans[i];
        }
        return a;
    }
}