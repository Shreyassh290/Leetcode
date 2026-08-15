class Solution {
    static int histogram(int []heights){
        int n=heights.length;
       int ps[]=new int[n];
       int ns[]=new int[n];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++){
        while(st.size()!=0 && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.size()==0) ps[i]=-1;
        else ps[i]=st.peek();
        st.push(i);
       } 
       while(st.size()!=0) st.pop();
       for(int i=n-1;i>=0;i--){
        while(st.size()!=0 && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.size()==0) ns[i]=n;
        else ns[i]=st.peek();
        st.push(i);
       } 
       int ans[]=new int[n];
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
         ans[i]=heights[i]*(ns[i]-ps[i]-1);
         max=Math.max(max,ans[i]);
       }
       return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=Integer.MIN_VALUE;
        int arr[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(matrix[i][j]=='1'){
                arr[j]++;
              }
              else{
                arr[j]=0;
              }
            }
            max=Math.max(max,histogram(arr));
        }
        return max;
    }
    
}