class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int ns[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()!=0 && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.size()==0){
                ns[i]=n;
            }
            else{
                ns[i]=st.peek();
            }
            st.push(i);
        }
        int j=0;
        int ans[]=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            if(j>=k+i) j=i;
            
            while(j<k+i){
                ans[i]=nums[j];
                j=ns[j];
            }
        }
       return ans;
    }
}