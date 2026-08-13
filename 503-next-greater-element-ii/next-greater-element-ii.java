class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int cur=nums[i%n];
            while(st.size()!=0 && st.peek()<=cur){
                st.pop();
            }
            res[i%n]=st.isEmpty()?-1:st.peek();
            st.push(cur);
        } 
        return res;
    }
}