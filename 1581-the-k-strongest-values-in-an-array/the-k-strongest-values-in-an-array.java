class Solution {
    public int[] getStrongest(int[] arr, int k) {
       int n=arr.length;
       Arrays.sort(arr);
       int center = arr[(n - 1) / 2];
       int nums[]=new int[k];
       int i=0;
       int j=n-1;
       int c=0;
       while(c<k){
        int m1=Math.abs(arr[i]-center);
        int m2=Math.abs(arr[j]-center);
        if(m1>m2){
            nums[c++]=arr[i];
            i++;
        }
        else if(m1==m2){
            nums[c++]=Math.max(arr[i],arr[j]);
            if(arr[i]==Math.max(arr[i],arr[j])){
                i++;
            }
            else{
                j--;
            }
        }
        else{
            nums[c++]=arr[j--];
        }
       }
       return nums;
    }
}