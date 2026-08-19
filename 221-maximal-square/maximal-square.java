class Solution {
    static int find(int arr[]){
        int n=arr.length;
        int ps[]=new int[n];
        int ns[]=new int[n];
        Stack<Integer> st1=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(st1.size()!=0 && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            if(st1.size()==0)ps[i]=-1;
            else ps[i]=st1.peek();
            st1.push(i);
        }
        while(st1.size()!=0) st1.pop();
        for(int i=n-1;i>=0;i--){
            while(st1.size()!=0 && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            if(st1.size()==0)ns[i]=n;
            else ns[i]=st1.peek();
            st1.push(i);
        }
        int ans[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int side=Math.min(arr[i],ns[i]-ps[i]-1);
            ans[i]=side*side;
            max=Math.max(max,ans[i]);
        }
        return max;
    }
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int height[]=new int[m];
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='0'){
                    height[j]=0;
                }
                else{
                    height[j]++;
                }
            }
            ans=Math.max(ans,find(height));
        }
        return ans;
    }
}