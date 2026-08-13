class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int c=1;
        int s=(int)n/4;
       
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                c=1;
            }
            if(c>s) return arr[i];
        }
        return arr[0];
    }
}