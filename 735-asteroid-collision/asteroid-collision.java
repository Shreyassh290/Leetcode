class Solution {
    public int[] asteroidCollision(int[] a) {
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(a[i]);
            }
            else if(a[i]<0){
                if(st.peek()<0){
                    st.push(a[i]);
                    
                }
                else{
                while(st.size()!=0 && st.peek()>0 && st.peek()<-a[i]){
                    st.pop();
                }
                if(st.size()==0) st.push(a[i]);
                else if(st.peek()<0) st.push(a[i]);
                else if(st.peek()==-a[i]) st.pop();
                }
            }
            else{
                st.push(a[i]);
            }
        }
        int arr[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}