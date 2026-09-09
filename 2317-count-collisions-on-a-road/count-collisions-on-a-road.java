class Solution {
    public int countCollisions(String directions) {
        int n=directions.length();
        int c=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
          char ch=directions.charAt(i);
          if(st.size()==0){
            st.push(ch);
          }
          else if(st.peek()=='S' && ch=='S'){
            st.push(ch);
          }
          else if((st.peek()=='R' && ch=='S') ||( st.peek()=='S' && ch=='L')){
            st.pop();
            st.push('S');
            st.push('S');
            c++;
          }
          else if(st.peek()=='R' && ch=='L'){
            st.pop();
            st.push('S');
            st.push('S');
            c+=2;
          }
          else{
            st.push(ch);
          }
        }
        while(st.size()!=0 && st.size()!=1){
            char ch1=st.pop();
            char ch2=st.pop();
            if(ch1=='L' &&( ch2=='R' || ch2=='S')){
              if(ch2=='R'){
                c+=2;
              } 
              else{
                c+=1;
              }
              st.push('S');
            }
            else if(ch1=='S' && ch2=='R'){
                c++;
                st.push('S');
            }
            else if(ch1==ch2){
                st.push(ch1);
            }
            else{
             st.push('S');
            }

        }
        return c;
    }
}