class Solution {
    public int calPoints(String[] operations) {
       int n=operations.length;
       int ans=0;
       int arr[]=new int[n];
       int k=0;
       for(int i=0;i<n;i++){
        String c=operations[i];
        if(c.equals("C")){
          arr[--k]=0;
        }
        else if(c.equals("D")){
            int val=arr[k-1];
            arr[k++]=val*2;
        }
        else if(c.equals("+")){
            int s=arr[k-2]+arr[k-1];
            arr[k++]=s;
        }
        else{
            arr[k++] = Integer.parseInt(c);
        }
       } 
       for(int i=0;i<k;i++){
        ans+=arr[i];
       }
       return ans;
    }
}