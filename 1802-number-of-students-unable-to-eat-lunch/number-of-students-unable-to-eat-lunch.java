class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Stack<Integer> st=new Stack<>();
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<students.length;i++){
        q.add(students[i]);
       } 
       for(int i=sandwiches.length-1;i>=0;i--){
        st.push(sandwiches[i]);
       }
       while(st.size()!=0){
        int c=0;
        while(q.peek()!=st.peek()){
            if(c>=st.size()){
                return st.size();
            }
            q.add(q.remove());
            c++;
        }
        q.remove();
        st.pop();
       }
       return 0;
    }
}