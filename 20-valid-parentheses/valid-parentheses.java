class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.size()==0){
                    return false;
                }
                char top=st.peek();
                if((c==')' && top!='(' )||( c=='}' && top!='{') ||( c==']' && top!='[')){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
}