class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        if(n==1){
            arr[0]=-1;
            return arr;
        }
        int gt=arr[n-1];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            res[i]=gt;
            if(gt<arr[i]){
                gt=arr[i];
            }
        }
        return res;
    }
}