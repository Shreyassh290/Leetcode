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
    public ListNode removeNodes(ListNode head) {
        ListNode r=rev(head);
        ListNode temp=r;
        ListNode dummy =new ListNode(0);
        ListNode l=dummy;
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.val>=max){
              max=temp.val;
              ListNode n=new ListNode(temp.val);
              l.next=n;
              l=l.next;
            }
            temp=temp.next;
        }
       dummy=rev(dummy.next);
       return dummy;
    }
}