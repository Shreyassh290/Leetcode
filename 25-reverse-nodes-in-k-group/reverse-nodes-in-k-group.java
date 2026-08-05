/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode rev(ListNode head){
        ListNode cur,nex,prev;
        cur=head;
        nex=null;
        prev=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int c=0;
        if (head == null || k == 1)
          return head;
        ListNode tail=head;
        ListNode prev=null;
        ListNode temp=head;
        ListNode final1=head;
        ListNode head1=head;
        head=head1;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int s=0;
        temp=head;
        int group=c/k;
        int g=0;
        ListNode newhead;
        while(g!=group){
            if(s+1==k){
             g++;
             head1=temp;
             newhead=head1.next;
             head1.next=null;
             tail=rev(tail);
            
             if (g == 1) {
              final1 = tail;
            } else {
                 prev.next = tail;
            }
             while(tail.next!=null){
                tail=tail.next;
             }
             tail.next=newhead;
             prev=tail;
             tail=newhead;
             temp=prev;
             s=0;
            }
            else{
             s++;
            }
            temp=temp.next;
            
        }
        return final1;
    }
}