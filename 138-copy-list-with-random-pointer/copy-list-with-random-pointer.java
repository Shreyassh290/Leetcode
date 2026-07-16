/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node h=new Node(0);
        Node temp=head;
        Node temp1=h;
        while(temp!=null){
         Node n=new Node(temp.val);
         temp1.next=n;
         temp1=temp1.next;
         temp=temp.next;
        }
        h=h.next;
        temp=head;
        temp1=h;
        Node dummy=new Node(0);
        Node t=dummy;
        while(temp!=null &&temp1!=null){
            t.next=temp;
            temp=temp.next;
            t=t.next;

            t.next=temp1;
            if(temp1==null) break;
            temp1=temp1.next;
            t=t.next;
        }
        temp=head;
        temp1=h;
        t=dummy;
        while(temp!=null && temp1!=null){
            if(temp.random==null) temp1.random=null;
            else{
             temp1.random=temp.random.next;
            }
             temp=temp.next.next;
             if(temp1.next==null) break;
             temp1=temp1.next.next;
        }
        temp=head;
        temp1=h;
        while(temp!=null && temp1!=null){
            temp.next = temp1.next;
             temp = temp.next;

            if(temp != null)
                temp1.next = temp.next;
            else
             temp1.next = null;

         temp1 = temp1.next;
        }
        return h;
    }
}