class MyCircularQueue {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }   
    int c=0;
    public MyCircularQueue(int k){
    c=k;
    }
    Node head=null;
    Node tail=null;
    int size=-1;
    public boolean enQueue(int value) {
       if(size==c-1){
        return false;
       }
       Node n=new Node(value);
       if(head==null){
        head=n;
        tail=n;
        tail.next=head;
       }
       else{
        tail.next=n;
        tail=n;
        tail.next=head;
       }
       size++;
       return true;
    }
    
    public boolean deQueue() {
        if(size==-1){
            return false;
        }
        if(head==tail){
            head=null;
            tail=null;
            size--;
        }
        else{
        head=head.next;
        tail.next=head;
        size--;
        }
        return true;
    }
    
    public int Front() {
        if(size==-1){
            return -1;
        }
        else{
            return head.data;
        }
    }
    
    public int Rear() {
        if(size==-1){
            return -1;
        }
        return tail.data;
    }
    
    public boolean isEmpty() {
        if(size==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==c-1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */