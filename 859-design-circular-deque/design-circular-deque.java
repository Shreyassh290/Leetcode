class MyCircularDeque {
    Deque<Integer> q=new LinkedList<>(); 
    int c;
    public MyCircularDeque(int k) {
        c=k;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            q.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            q.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(q.size()!=0){
            q.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
      if(q.size()!=0){
        q.removeLast();
        return true;
      }
      return false;
    }
    
    public int getFront() {
      if (isEmpty()) {
        return -1;
      }
       return q.getFirst(); 
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return q.getLast();
    }
    
    public boolean isEmpty() {
        if(q.size()==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(q.size()==c){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */