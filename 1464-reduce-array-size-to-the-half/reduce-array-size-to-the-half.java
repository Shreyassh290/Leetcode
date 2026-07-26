class Solution {
    public int minSetSize(int[] arr) {
       int n=arr.length;
       Arrays.sort(arr);
       int c=0;
       for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
            c++;
        }
       } 
       int nums[]=new int[c+1];
       int j=0;
       int k=0;
       for(int i=0;i<n;i++){
        int val=arr[i];
        j=0;
         while(i<n && val==arr[i]){
            i++;
            j++;
         }
         i--;
         nums[k++]=j;
       }
       Arrays.sort(nums);
       int m=n/2,sum=0;
       k=0;
       for(int i=c;i>=0;i--){
        if(sum>=m){
            return k;
        }
        k++;
        sum+=nums[i];
       }
       return k;
    }
}